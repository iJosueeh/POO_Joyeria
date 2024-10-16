/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joyeria.modelo.usuarios;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import joyeria.modelo.pedidos.Pedido;
import joyeria.modelo.productos.Producto;

public class Cliente {
    private Direccion direccion;
    private String correo;
    private String telefono;
    private Set<Pedido> historialDePedidos;

    public Cliente(Direccion direccion, String correo, String telefono) {
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.historialDePedidos = new HashSet<>();
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Set<Pedido> getHistorialDePedidos() {
        return historialDePedidos;
    }

    public void realizarPedido(List<Producto> producto) {
        // Lógica para realizar un pedido
    }
}