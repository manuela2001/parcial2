/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexion.Singleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import modelos.Cliente;
import modelos.Pedido;

/**
 *
 * @author LENOVO
 */
public class DAOPedido {

    private final Connection connection;

    public DAOPedido() {
        this.connection = Singleton.getInstancia().getConnection();
    }

    public ArrayList<Pedido> listarTodosLosPedidos() {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String query = "SELECT * FROM tabla_pedidos";

        try ( PreparedStatement ps = connection.prepareStatement(query)) {

            ResultSet rs;

            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("pedidoID");
                LocalDate fecha = rs.getDate("fechaPedido").toLocalDate();
                float total = rs.getFloat("total");
                int cliente_id = rs.getInt("idCliente");

                Cliente cliente = obtenerCliente(cliente_id);
                Pedido pedido = new Pedido(id, fecha, total, cliente);
                pedidos.add(pedido);
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return pedidos;
    }

    public ArrayList<Pedido> listarPedidoPorCliente(int id) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String query = "SELECT * FROM tabla_pedidos WHERE idCliente = ?";

        try ( PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                LocalDate fechaPedido = rs.getDate("fechaPedido").toLocalDate();
                float total = rs.getFloat("total");
                int idCliente = rs.getInt("idCliente");
                
                Cliente cliente = obtenerCliente(idCliente);

                Pedido pedido = new Pedido(id, fechaPedido, total, cliente);
                pedidos.add(pedido);
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        return pedidos;
    }

    public Pedido seleccionarPedido(int id){
        String query = "SELECT * FROM tabla_pedidos WHERE pedidoID = ?";
        try ( PreparedStatement ps = connection.prepareStatement(query)) {
            ResultSet rs;

            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                LocalDate fechaPedido = rs.getDate("fechaPedido").toLocalDate();
                float total = rs.getFloat("total");
                int clienteId = rs.getInt("idCliente");

                Cliente cliente = obtenerCliente(clienteId);
                return new Pedido(id, fechaPedido, total, cliente);
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        return null;
    }

    public void editarPedido(Pedido pedido) throws SQLException {
        String query = "UPDATE tabla_pedidos SET total = ?, idCliente = ?";
        try ( PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setFloat(1, pedido.getTotal());
            ps.setInt(2, pedido.getCliente().getID());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

    public void eliminarPedido(int id) {
        String query = "DELETE FROM tabla_pedidos WHERE pedidoID = ?";
        try ( PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

    public void registrarPedido(Pedido pedido) throws SQLException{
        String query = "INSERT INTO tabla_pedidos (fechaPedido, total, idCliente) VALUES (?,?,?)";
        try ( PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setDate(1, java.sql.Date.valueOf(pedido.getFechaPedido()));
            ps.setFloat(2, pedido.getTotal());
            ps.setInt(3, pedido.getCliente().getID());

            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

    private Cliente obtenerCliente(int id) {
        DAOCliente daoCliente = new DAOCliente();
        return daoCliente.buscarCliente(id);
    }
    public ArrayList<Cliente> listarClientes() {
        ArrayList<Cliente> clientes = new ArrayList<>();

        try {
            PreparedStatement ps;
            ResultSet rs;

            String query = "SELECT * FROM tabla_clientes";

            ps = connection.prepareStatement(query);
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
}
