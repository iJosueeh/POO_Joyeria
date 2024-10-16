/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joyeria.menus.pedidos;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import joyeria.modelo.pedidos.Pedido;
import joyeria.modelo.productos.Producto;
import joyeria.modelo.usuarios.Cliente;

public class AgregarPedidos {

    List<Producto> productosDisponibles;

    public AgregarPedidos() {
        this.productosDisponibles = productosDisponibles;
    }

    public void mostrarMenu(Scanner scanner, Cliente cliente) {

        if (cliente == null) {
            System.out.println("El cliente no fue encontrado o no fue proporcionado correctamente.");
            return; 
        }

        System.out.println("Ingresa el nombre del Cliente: ");
        String nombreCliente = scanner.nextLine();

        if (cliente.getNombre().equalsIgnoreCase(nombreCliente)) {
            System.out.println("Cliente encontrado: " + cliente.getNombre());
            System.out.println("Productos disponibles: ");

            for (Producto producto : productosDisponibles) {
                if (producto.equals(cliente.getIdUsuario())) {
                    System.out.println("- ID " + producto.getId_Producto() + ", Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
                }
            }

            LocalDate fechaActual = LocalDate.now();
            Pedido nuevoPedido = new Pedido(cliente, fechaActual);

            cliente.getHistorialDePedidos().add(nuevoPedido);
            System.out.println("Pedido finalizado. Total del pedido: " + nuevoPedido.getTotal());
        } else {
            System.out.println("Cliente no encontrado.");
        }

    }
}
