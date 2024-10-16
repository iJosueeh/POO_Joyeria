package joyeria.menus.CuponesYReseñas;

import java.util.HashMap;
import java.util.Scanner;

public class EliminarCupones {
    
    public void EliminarCupones (Scanner scanner){
        
        HashMap<String, Double> cupones = AgregarCupones.obtenerCupones();

        if (cupones.isEmpty()) {
            System.out.println("No hay cupones activos");
        } else {
            System.out.println("Ingrese el nombre del producto cuyo cupón desea eliminar:");
            String producto = scanner.nextLine();

          
            if (cupones.containsKey(producto)) {
                cupones.remove(producto);
                System.out.println("El cupón para el producto " + producto + " ha sido eliminado.");
            } else {
                System.out.println("No se encontró ningún cupón para el producto " + producto + ".");
            }
        }
        System.out.println("\nPresione Enter para regresar al menú de reseñas...");
        scanner.nextLine(); 
    }
}
   

