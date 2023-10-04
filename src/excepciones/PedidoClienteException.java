/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Manuela Gomez
 */
public class PedidoClienteException extends RuntimeException {
    public PedidoClienteException(){
        super("El cliente tiene pedidos");
    }
    
}
