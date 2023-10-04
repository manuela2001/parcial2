/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;



import DAO.DAOCliente;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Cliente;



/**
 *
 * @author LENOVO
 */
public class ControladorCliente {

    private DAOCliente DAOCliente;
    
    public ControladorCliente() {
        this.DAOCliente = new DAOCliente();
    }
    
    public ArrayList<Cliente> listarClientes(){
        return DAOCliente.listarClientes();
    }
    
    public Cliente buscarCliente(int id){
        return DAOCliente.buscarCliente(id);
    }
    
     public void agregarCliente(Cliente cliente) throws SQLException {
         DAOCliente.agregarCliente(cliente);
     }
     
     public void editarCliente(Cliente cliente) throws SQLException {
         DAOCliente.editarCliente(cliente);
     }
     
     public void eliminarCliente(int id) {
         DAOCliente.eliminarCliente(id);
     }
}
