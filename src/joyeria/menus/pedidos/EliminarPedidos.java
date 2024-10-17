/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joyeria.menus.pedidos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import joyeria.modelo.pedidos.Pedido;
import joyeria.servicio.GestionPedido;

public class EliminarPedidos {

    private Map<Integer, Pedido> pedidos;
    GestionPedido gestionarPedidos;

    public EliminarPedidos() {
        this.pedidos = new HashMap<>();
        this.gestionarPedidos = new GestionPedido();
    }

    public void mostrarMenu(Scanner scanner) {
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos para eliminar,");
            return;
        }

        System.out.println("Lista de Pedidos:");
        for (Pedido pedido : pedidos.values()) {
            System.out.println("- ID: " + pedido.getIdPedido() + ", Fecha Solicitada: " + pedido.getFechaPedido());
        }

        System.out.println("Ingresa el ID del Pedido que deseas eliminar: ");
        int idPedido = scanner.nextInt();
        
        Pedido pedido = pedidos.get(idPedido);
        
        if (pedido != null) {
            gestionarPedidos.cancelarPedido(pedido);
        } else {
            System.out.println("No se ha encontrado un pedido con este ID.");
        }

    }
}
