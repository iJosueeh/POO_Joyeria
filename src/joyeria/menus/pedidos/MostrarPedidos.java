/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joyeria.menus.pedidos;

import java.util.Scanner;
import joyeria.modelo.pedidos.Pedido;
import joyeria.servicio.GestionPedido;

public class MostrarPedidos {

    private GestionPedido gestionarPedidos;

    public MostrarPedidos() {
        this.gestionarPedidos = new GestionPedido();
    }

    public void mostrarMenu(Scanner scanner) {
        if (gestionarPedidos.getPedidos().isEmpty()) {
            System.out.println("No hay pedidos disponibles para mostrar.");
            return;
        }

        System.out.println("Lista de Pedidos:");
        for (Pedido pedido : gestionarPedidos.getPedidos().values()) {
            System.out.println("- ID: " + pedido.getIdPedido() + ", Fecha: " + pedido.getFechaPedido());
        }

        System.out.println("Ingresa el ID del Pedido que deseas ver: ");
        int idPedido = scanner.nextInt();

        gestionarPedidos.mostrarPedido(idPedido);
    }

}
