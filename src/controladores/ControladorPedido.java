/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import DAO.DAOPedido;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Cliente;
import modelos.Pedido;

/**
 *
 * @author Manuela Gomez
 */
public class ControladorPedido {

    private DAOPedido DAOPedido;

    public ControladorPedido() {
        this.DAOPedido = new DAOPedido();
    }

    public ArrayList<Pedido> listarTodosLosPedidos() {
        return DAOPedido.listarTodosLosPedidos();
    }

    public ArrayList<Pedido> listarPedidoPorCliente(int id) {
        return DAOPedido.listarPedidoPorCliente(id);
    }

    public Pedido seleccionarPedido(int id) {
        return DAOPedido.seleccionarPedido(id);
    }

    public void editarPedido(Pedido pedido) throws SQLException {
        DAOPedido.editarPedido(pedido);
    }

    public void registrarPedido(Pedido pedido) throws SQLException {
        DAOPedido.registrarPedido(pedido);
    }
    public ArrayList<Cliente>listarClientes(){
        return DAOPedido.listarClientes();
    }
    public void eliminarPedido(int id){
        DAOPedido.eliminarPedido(id);
    }

}
