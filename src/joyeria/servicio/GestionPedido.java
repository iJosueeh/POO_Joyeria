/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joyeria.servicio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import joyeria.interfaces.IGestionPedido;
import joyeria.modelo.pedidos.Pedido;
import joyeria.modelo.productos.Producto;

public class GestionPedido implements IGestionPedido {

    private Map<Integer, Pedido> pedidos;
    private List<Producto> productosDisponibles;
    private int contador;
    private Scanner scanner;

    public GestionPedido(Scanner scanner) {
        this.scanner = scanner;
        this.pedidos = new HashMap<>();
    }

    public void mostrarPedido(int idPedido) {
        Pedido pedido = pedidos.get(idPedido);

        if (pedido != null) {
            System.out.println("ID del Pedido: " + pedido.getIdPedido());
            System.out.println("Cliente: " + pedido.getCliente());
            System.out.println("Fecha del pedido: " + pedido.getFechaPedido());
            System.out.println("Productos: ");

            for (Map.Entry<Producto, Integer> productos : pedido.getProductos().entrySet()) {
                Producto producto = productos.getKey();
                int cantidad = productos.getValue();
                System.out.println("- " + producto.getNombre() + " (Cantidad: " + cantidad + ", Precio: " + producto.getPrecio() + ")");
            }
            System.out.println("Total: " + pedido.getTotal());
        } else {
            System.out.println("El pedido con el ID " + idPedido + " no existe.");
        }
    }

    @Override
    public void realizarPedido(Pedido pedido) {
        if (pedido.getProductos().isEmpty()) {
            System.out.println("No hay productos agregados.");
            return;
        }

        pedido.setIdPedido(++contador);
        pedidos.put(pedido.getIdPedido(), pedido);

        System.out.println("Pedido realizado con exito. ID del Pedido: " + pedido.getIdPedido());
    }

    @Override
    public void cancelarPedido(Pedido pedido) {
        if (pedidos.containsKey(pedido.getIdPedido())) {
            pedidos.remove(pedido.getIdPedido());
            System.out.println("El pedido con ID " + pedido.getIdPedido() + " ha sido cancelado.");
        } else {
            System.out.println("El pedido con ID " + pedido.getIdPedido() + " no existe.");
        }
    }

    public Producto buscarProductoID(int idProducto) {
        for (Producto producto : productosDisponibles) {
            if (producto.getId_Producto() == idProducto) {
                return producto; // Retorna el producto si lo encuentra
            }
        }
        return null; 
    }
}
