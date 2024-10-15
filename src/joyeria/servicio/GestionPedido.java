/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joyeria.servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import joyeria.interfaces.IGestionPedido;
import joyeria.modelo.pedidos.Pedido;
import joyeria.modelo.productos.Producto;

public class GestionPedido implements IGestionPedido {

    private Map<Integer, Pedido> pedidos;
    private int contador;
    private Scanner scanner;

    public GestionPedido(Scanner scanner) {
        this.scanner = scanner;
        this.pedidos = new HashMap<>();
    }
    
    public void mostrarPedido(int idPedido) {
        Pedido pedido = pedidos.get(idPedido);
        
        if (pedido != null) {
            System.out.println("Pedido ID: " + pedido.getIdPedido());
            System.out.println("Cliente: " + pedido.getCliente());
            System.out.println("Fecha del pedido: " + pedido.getFechaPedido());
            System.out.println("Productos: ");
            
            for (Map.Entry<Producto, Integer> productos : pedido.getProductos().entrySet()) {
                Producto producto = productos.getKey();
                int cantidad = productos.getValue();
                // System.out.println("- " + producto.getNombre() + " (Cantidad: ) " + cantidad + ", Precio: " + producto.getPrecio() + ")";
            }
            System.out.println("Total: " + pedido.getTotal());
        } else {
            System.out.println("El pedido con el ID " + idPedido + " no existe.");
        }
    }
    
    @Override
    public void realizarPedido(Pedido pedido) {
        
    }

    @Override
    public void cancelarPedido(Pedido pedido) {

    }

    @Override
    public void consultarPedido(Pedido pedido) {

    }

}
