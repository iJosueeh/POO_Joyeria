/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joyeria.modelo.pedidos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import joyeria.modelo.productos.Producto;
import joyeria.modelo.usuarios.Cliente;

public class Pedido {

    private int contador = 1;
    private int idPedido;
    private Cliente cliente;
    private Map<Producto, Integer> productos;
    private LocalDate fechaPedido;
    private double total;

    public Pedido(Cliente cliente, LocalDate fechaPedido) {
        this.idPedido = contador++;
        this.cliente = cliente;
        this.productos = new HashMap<>();
        this.fechaPedido = fechaPedido;
        this.total = 0.0;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Map<Producto, Integer> getProductos() {
        return productos;
    }

    public void setProductos(Map<Producto, Integer> productos) {
        this.productos = productos;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void agregarPedido(Producto producto, int cantidad) {
        //  Si el producto se encuentra en el pedido, sumamos la cantidad
        if (productos.containsKey(producto)) {
            productos.put(producto, productos.get(producto) * cantidad);
        } else {
            productos.put(producto, cantidad);
        }
        calcularTotal();
    }

    public void eliminarPedido(Producto producto) {
        if (productos.containsKey(producto)) {
            productos.remove(producto);
            calcularTotal();
        }
    }

    public void calcularTotal() {
        double totalCompra = 0;

        // Calculando el total iterando cada producto almacenado
        for (Map.Entry<Producto, Integer> producto : productos.entrySet()) {
            Producto productos = producto.getKey();
            double cantidad = producto.getValue();
            totalCompra += productos.getPrecio() * cantidad;
        }

        this.total = totalCompra;
    }
}
