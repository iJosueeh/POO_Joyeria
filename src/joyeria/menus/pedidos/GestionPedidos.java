/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joyeria.menus.pedidos;

import java.util.Scanner;
import joyeria.modelo.usuarios.Cliente;

public class GestionPedidos {

    AgregarPedidos agregarPedidos;
    EliminarPedidos eliminarPedidos;
    MostrarPedidos mostrarPedidos;

    public GestionPedidos() {
        this.agregarPedidos = new AgregarPedidos();
        this.eliminarPedidos = new EliminarPedidos();
        this.mostrarPedidos = new MostrarPedidos();
    }

    public void mostrarMenu(Scanner scanner) {
        boolean continuarMenu = true;

        do {
            System.out.println("\n>>=================================================<<");
            System.out.println("    Gestión de Pedidos - Joyas del Corazón");
            System.out.println(">>=================================================<<\n");
            System.out.println("→ [1] Agregar Pedido.");
            System.out.println("→ [2] Eliminar Pedido.");
            System.out.println("→ [3] Mostrar Pedido.");
            System.out.println("→ [4] Salir.");
            System.out.print("Seleccione una opción: ");

            int opcionMenu = scanner.nextInt();

            scanner.nextLine();

            switch (opcionMenu) {
                case 1:
                    agregarPedidos.mostrarMenu(scanner);
                    break;
                case 2:
                    eliminarPedidos.mostrarMenu(scanner);
                    break;
                case 3:
                    mostrarPedidos.mostrarMenu(scanner);
                    break;
                case 4:
                    System.out.println("Regresando al menú principal...");
                    continuarMenu = false;
                    break;
                default:
                    System.out.println("Opción no valida, seleccione el número adecuado.");
            }

        } while (continuarMenu);

    }
}
