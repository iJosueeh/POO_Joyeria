package joyeria.menus.CuponesYReseñas;

import java.util.Scanner;

public class GestionReseñas {
    
    DejarReseñas dejarReseñas = new DejarReseñas();
    VerReseñas verReseñas = new VerReseñas();

     public void mostrarMenu(Scanner scanner) {
        boolean continuarMenu = true;
        do {
            // Menu Principal de Ingreso
            System.out.println(">>====================================<<");
            System.out.println("    Bienvenido al gestor de reseñas:\n");
            System.out.println(">>====================================<<");
            System.out.println("Seleccione una opción:\n");
            System.out.println("→ [1] DejarReseñas");
            System.out.println("→ [2] VerReseñas");
            System.out.println("→ [3] Salir\n");
            
            int opcionReseñas = scanner.nextInt();
            
            scanner.nextLine();
            
            switch (opcionReseñas){
                case 1:
                    dejarReseñas.DejarReseñas(scanner);
                    break;
                case 2:
                    verReseñas.MostrarReseñas(scanner);
                    break;
                case 3:
                    System.out.println("Regresando al menú...");
                    continuarMenu = false;
                    break;
                default:
                    System.out.println("Opción no encontrada, seleccione una opción valida");
            }
        }   while (continuarMenu);
     }
}    
