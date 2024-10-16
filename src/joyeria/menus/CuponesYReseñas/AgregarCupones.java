package joyeria.menus.CuponesYReseñas;

import java.util.HashMap;
import java.util.Scanner;

public class AgregarCupones {
    private static HashMap<String, Double> cupones = new HashMap<>();
    
    public void AgregarCupones (Scanner scanner){

        System.out.print("Ingrese el nombre del producto: ");
        String producto = scanner.nextLine();

        System.out.print("Ingrese el porcentaje de descuento");
        double descuento = scanner.nextDouble();

        cupones.put(producto, descuento);
        System.out.println("Cupón agregado exitosamente para " + producto + " con un descuento de " + descuento + "%.\n");
        
        System.out.println("\nPresione Enter para regresar al menú de reseñas...");
        scanner.nextLine(); 
        }
    public static HashMap<String, Double> obtenerCupones() {
        return cupones;
    }

   }
    

