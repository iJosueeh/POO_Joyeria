package joyeria.menus.CuponesYReseñas;

import java.util.HashMap;
import java.util.Scanner;

public class DejarReseñas {
    
    private static HashMap<String, String> reseñas = new HashMap<>();
    
    public void DejarReseñas(Scanner scanner){
        
        System.out.println("Ingrese el nombre del producto para dejar una reseña:");
        String producto = scanner.nextLine();

        System.out.println("Escriba su reseña:");
        String reseña = scanner.nextLine();

        reseñas.put(producto, reseña);

        System.out.println("Reseña guardada para el producto " + producto);
        
        System.out.println("\nPresione Enter para regresar al menú de reseñas...");
        scanner.nextLine(); 
    }
    public static HashMap<String, String> obtenerReseñas() {
        return reseñas;
    }
   }
    

