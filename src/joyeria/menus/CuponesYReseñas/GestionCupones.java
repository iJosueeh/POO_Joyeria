package joyeria.menus.CuponesYReseñas;

import java.util.Scanner;

public class GestionCupones {
    
    AgregarCupones agregarCupones = new AgregarCupones();
    EliminarCupones eliminarCupones = new EliminarCupones();
    VerCupones verCupones = new VerCupones();

     public void mostrarMenu(Scanner scanner) {
        boolean continuarMenu = true;
        do {
            // Menu Principal de Ingreso
            System.out.println(">>====================================<<");
            System.out.println("Bienvenido al menú de gestión de cupones");
            System.out.println(">>====================================<<");
            System.out.println("Seleccione una opción:\n");
            System.out.println("→ [1] AgregarCupones");
            System.out.println("→ [2] EliminarCupones");
            System.out.println("→ [3] VerCupones");
            System.out.println("→ [4] Salir\n");
            
            int opcionCupones = scanner.nextInt();
            
            scanner.nextLine();
            
            switch (opcionCupones){
                case 1:
                    agregarCupones.AgregarCupones(scanner);
                    break;
                case 2:
                    eliminarCupones.EliminarCupones(scanner);
                    break;
                case 3:
                    verCupones.VerCupones();
                    break;
                case 4:
                    System.out.println("Regresando al menú...");
                    continuarMenu = false;
                    break;
                default:
                    System.out.println("Opción no encontrada, seleccione una opción valida");
            }
        }   while (continuarMenu);
     }
}
            
            