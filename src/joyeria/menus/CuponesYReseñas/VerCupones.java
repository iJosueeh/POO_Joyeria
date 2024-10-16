package joyeria.menus.CuponesYReseñas;

import java.util.HashMap;

public class VerCupones{
     
    public void VerCupones() {
       HashMap<String, Double> cupones = AgregarCupones.obtenerCupones();

        if (cupones.isEmpty()) {
            System.out.println("No se encontraron cupones activos");
        } else {
            System.out.println("Cupones disponibles:");
            for (String producto : cupones.keySet()) {
                System.out.println("Producto: " + producto + " | Descuento: " + cupones.get(producto) + "%");
            }
        }
        System.out.println("\nPresione Enter para regresar al menú de reseñas...");
        scanner.nextLine(); 
    }
}
