/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.time.LocalDate;
/**
 *
 * @author Manuela Gomez
 */
public class Pedido {

   private int pedidoID;
    private LocalDate fechaPedido;
    private float total;
    private Cliente cliente;

    public Pedido(float total, Cliente cliente) {
        this.fechaPedido = LocalDate.now();
        this.total = total;
        this.cliente = cliente;
    }

    public Pedido(int pedidoID, LocalDate fechaPedido, float total, Cliente cliente) {
        this.pedidoID = pedidoID;
        this.fechaPedido = fechaPedido;
        this.total = total;
        this.cliente = cliente;
    }    
   
    public int getPedidoID() {
        return pedidoID;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setId(Cliente id) {
        this.cliente = id;
    }

    public  LocalDate getFechaPedido() {
        return fechaPedido;
    }


    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}