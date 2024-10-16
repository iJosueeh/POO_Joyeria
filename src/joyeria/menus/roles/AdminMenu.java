/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joyeria.menus.roles;

import java.util.Scanner;
import joyeria.menus.pedidos.GestionPedidos;
import joyeria.menus.usuarios.GestionUsuario;
import joyeria.modelo.usuarios.Cliente;

public class AdminMenu {

    GestionPedidos menuPedidos = new GestionPedidos();
    GestionUsuario menuUsuario = new GestionUsuario();
    Cliente cliente;
    
    public void mostrarMenu(Scanner scanner) {
        boolean continuarMenu = true;
        
        do {
            System.out.println("\n>>=================================================<<");
            System.out.println("    Menú Administrativo - Joyas del Corazón");
            System.out.println(">>=================================================<<\n");
            System.out.println("→ [1] Gestión de Usuarios");
            System.out.println("→ [2] Gestión de Productos");
            System.out.println("→ [3] Gestión de Pedidos");
            System.out.println("→ [4] Gestión de Cupones");
            System.out.println("→ [5] Gestión de Reseñas");
            System.out.println("→ [6] Ver Reportes");
            System.out.println("→ [7] Volver al Menú Principal");
            System.out.println("→ [8] Cerrar Programa");
            System.out.print("Seleccione su opción: ");
            int opcionMenu = scanner.nextInt();
            
            switch (opcionMenu) {
                case 1:
                    menuUsuario.mostrarMenu(scanner);
                    break;
                case 2:
                    System.out.println("Gestion de Productos");
                    break;
                case 3:
                    menuPedidos.mostrarMenu(scanner, cliente);
                    break;
                case 4:
                    System.out.println("Gestion de Cupones");
                    break;
                case 5:
                    System.out.println("Gestion de Reseñas");
                    break;
                case 6:
                    System.out.println("Ver reportes");
                    break;
                case 7:
                    // Volviendo al menú principal
                    System.out.println("Volviendo al menú principal..\n");
                    continuarMenu = false;
                    break;
                case 8:
                    // Cerrar el programa
                    System.out.println("Cerrando el programa, vuelva pronto!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no valida, ingresa el número indicado en las opciones.\n");
            }
            
        } while (continuarMenu);
    }
}
