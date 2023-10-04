/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexion.Singleton;
import excepciones.PedidoClienteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Cliente;

/**
 *
 * @author LENOVO
 */
public class DAOCliente {

    private final Connection con;

    public DAOCliente() {

        con = Singleton.getInstancia().getConnection();
    }

    public ArrayList<Cliente> listarClientes() {
        ArrayList<Cliente> clientes = new ArrayList<>();

        try {
            PreparedStatement ps;
            ResultSet rs;

            String query = "SELECT * FROM tabla_clientes";

            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                int clienteId = rs.getInt("clienteID");
                String nombreCliente = rs.getString("nombre");
                String email = rs.getString("email");

                Cliente cliente = new Cliente(clienteId, nombreCliente, email);
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        return clientes;
    }

    public Cliente buscarCliente(int id) {
        try {
            PreparedStatement ps;
            ResultSet rs;

            String query = "SELECT clienteID, nombre, email FROM tabla_clientes WHERE clienteID = ?";

            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                int clienteId = rs.getInt("clienteID");
                String nombreCategoria = rs.getString("nombre");
                String email = rs.getString("email");

                Cliente cliente = new Cliente(clienteId, nombreCategoria, email);

                return cliente;
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        return null;
    }

    public void agregarCliente(Cliente cliente) throws SQLException {
        try {
            PreparedStatement ps;

            String query = "INSERT INTO tabla_clientes(clienteID, nombre, email) VALUES (?,?,?)";
            ps = con.prepareStatement(query);

            ps.setInt(1, cliente.getID());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getEmail());

            ps.executeUpdate();

        } catch (SQLException ex) {
            System.err.println(ex.toString());
            throw new SQLException();
        }
    }

    public void editarCliente(Cliente cliente) throws SQLException {
        try {
            PreparedStatement ps;

            String query = "UPDATE tabla_clientes SET nombre = ?, email = ? WHERE clienteID = ?";

            ps = con.prepareStatement(query);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getEmail());
            ps.setInt(3, cliente.getID());

            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.toString());
            throw new SQLException();
        }
    }

    public void eliminarCliente(int id) {
        String query = "DELETE FROM tabla_clientes WHERE clienteID = ? AND NOT EXISTS (SELECT 1 FROM tabla_pedidos WHERE idCliente = ?)";

        try (PreparedStatement ps = con.prepareStatement(query)){

            ps.setInt(1, id);
            ps.setInt(2, id);
            int rowsDeleted = ps.executeUpdate();
            
            if (rowsDeleted == 0){
                throw new PedidoClienteException();
            }     
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
}
