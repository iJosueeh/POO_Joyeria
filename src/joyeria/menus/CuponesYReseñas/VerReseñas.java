package joyeria.menus.CuponesYReseñas;

import java.util.HashMap;
import java.util.Scanner;

public class VerReseñas {
   
    public void MostrarReseñas(Scanner scanner){
        HashMap<String, String> reseñas = DejarReseñas.obtenerReseñas();

        if (reseñas.isEmpty()) {
            System.out.println("No se encontraron reseñas");
        } else {
            System.out.println("Reseñas disponibles:");
            for (String producto : reseñas.keySet()) {
                System.out.println("Producto: " + producto + " | Reseña: " + reseñas.get(producto));
            }
        }        
        System.out.println("\nPresione Enter para regresar al menú de reseñas...");
        scanner.nextLine();  // Esperar a que el usuario presione Enter
    }
}
