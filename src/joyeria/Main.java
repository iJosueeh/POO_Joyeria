/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joyeria;

import java.util.Scanner;
import joyeria.menus.AdminMenu;
import joyeria.menus.UsuariosMenu;

/*
    Proyecto: Joyeria - Tienda Online
    
    Integrantes:
    - Josue Royer Tanta Cieza 
    - Luis Angel Blas Caja
    - Katherine Patricia Salas Quiroz
    - Ashley Dhayana Chavez Coz

*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdminMenu menuAdmin = new AdminMenu();
        UsuariosMenu menuUsuario = new UsuariosMenu();
        boolean continuar = true;
        
        do {
            // Menu Principal de Ingreso
            System.out.println(">>====================================<<");
            System.out.println("    Bienvenidos a Joyas del Corazón");
            System.out.println(">>====================================<<");
            System.out.println("Seleccione su tipo de rol:\n");
            System.out.println("→ [1] Administrador");
            System.out.println("→ [2] Usuario");
            System.out.println("→ [3] Salir\n");
            System.out.print("Seleccione su opción: ");
            int opcionRol = scanner.nextInt();
            
            switch (opcionRol) {
                case 1:
                    menuAdmin.mostrarMenu(scanner);
                    break;
                case 2:
                    menuUsuario.mostrarMenu(scanner);
                    break;
                case 3:
                    System.out.println("Saliendo del programa, vuelva pronto!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no valida, ingresa el número indicado.\n");
                    continuar = true;
                    break;
            }
            
        } while (continuar);
        
        scanner.close();
        
    }
}
