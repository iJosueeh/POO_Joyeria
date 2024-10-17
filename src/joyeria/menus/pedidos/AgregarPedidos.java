/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joyeria.menus.pedidos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import joyeria.modelo.pedidos.Pedido;
import joyeria.modelo.productos.Producto;
import joyeria.modelo.usuarios.Cliente;
import joyeria.servicio.GestionPedido;
import joyeria.servicio.GestionUsuario;

public class AgregarPedidos {

    List<Producto> productosDisponibles;
    GestionPedido gestionarPedido;
    List<Cliente> clientes;
    GestionUsuario gestionarUsuarios;

    public AgregarPedidos() {
        this.productosDisponibles = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.gestionarUsuarios = new GestionUsuario(clientes);
        this.gestionarUsuarios = new GestionUsuario();
    }

    public void mostrarMenu(Scanner scanner) {

        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados. Por favor, registre un cliente antes de continuar.");
            return;
        }

        System.out.println("Ingresa el nombre del Cliente: ");
        String nombreCliente = scanner.nextLine();

        Cliente cliente = gestionarUsuarios.buscarClientePorNombre(nombreCliente);

        if (cliente == null && clientes.isEmpty()) {
            System.out.println("El cliente no fue encontrado o no fue proporcionado correctamente.");
            return;
        }

        System.out.println("Cliente encontrado: " + cliente.getNombre());
        System.out.println("Productos disponibles: ");

        for (Producto producto : productosDisponibles) {
            if (producto.equals(cliente.getIdUsuario())) {
                System.out.println("- ID " + producto.getId_Producto() + ", Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
            }
        }

        LocalDate fechaActual = LocalDate.now();
        Pedido nuevoPedido = new Pedido(cliente, fechaActual);

        do {
            System.out.println("Ingresa el ID del producto que deseas agregar al pedido:  ");
            int idProducto = scanner.nextInt();

            if (idProducto == -1) {
                break;
            }

            Producto idEncontrado = gestionarPedido.buscarProductoID(idProducto);

            if (idEncontrado == null) {
                System.out.println("Producto no encontrado, intente de nuevo!");

            } else {
                System.out.println("Ingresa la cantidad de " + idEncontrado.getNombre() + ": ");
                int cantidad = scanner.nextInt();

                nuevoPedido.agregarPedido(idEncontrado, cantidad);
                System.out.println("Producto agregado al pedido: " + idEncontrado.getNombre() + ", Cantidad: " + cantidad);
            }

        } while (true);

        if (nuevoPedido.getProductos().isEmpty()) {
            System.out.println("No se agregaron productos al pedido. Pedido Cancelado");
            return;
        }

        gestionarPedido.realizarPedido(nuevoPedido);

        cliente.getHistorialDePedidos().add(nuevoPedido);
        System.out.println("Pedido finalizado. Total del pedido: " + nuevoPedido.getTotal());
    }
}
