/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joyeria.modelo.usuarios;

import joyeria.modelo.productos.Producto;

public class Administrador {

    // Atributos adicionales
    private String adminId; // Identificador del administrador
    private String nombre; // Nombre del administrador
    private String email; // Correo electrónico del administrador
    private int totalProductos; // Contador de productos gestionados
    private int totalPedidos; // Contador de pedidos gestionados

    // Constructor
    public Administrador(String adminId, String nombre, String email) {
        this.adminId = adminId;
        this.nombre = nombre;
        this.email = email;
        this.totalProductos = 0;
        this.totalPedidos = 0;
    }

    // Métodos para agregar y eliminar productos
    public void agregarProducto(Producto producto) {
        // Lógica para agregar un producto
        totalProductos++; // Incrementar el contador de productos
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public void eliminarProducto(int idProducto) {
        // Lógica para eliminar un producto
        totalProductos--; // Decrementar el contador de productos
        System.out.println("Producto con ID " + idProducto + " eliminado.");
    }

    public void gestionarPedidos() {
        // Lógica para gestionar pedidos
        System.out.println("Gestionando pedidos...");
        totalPedidos++; // Incrementar el contador de pedidos
    }

    // Métodos para obtener información
    public int getTotalProductos() {
        return totalProductos;
    }

    public int getTotalPedidos() {
        return totalPedidos;
    }

    public String getAdminId() {
        return adminId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}