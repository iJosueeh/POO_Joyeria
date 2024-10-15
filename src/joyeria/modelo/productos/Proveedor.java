
package joyeria.modelo.productos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Proveedor {
    private int idProveedor;
    private String nombre;
    private String telefono;
    private String direccion;
    private static List<Proveedor> listaProveedores = new ArrayList<>();// base de datos provedores

    public Proveedor(int idProveedor, String nombre, String telefono, String direccion) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    //metodo registro proveedores
    public void registrar_Provedor(){
        listaProveedores.add(this);
        System.out.println("Se registro al proveedor exitosamente"+ this);
    }
    //metodo actualizar datos de proveedores
    public void Actualizar_Datos(){
        Scanner scanner = new Scanner (System.in);
         System.out.println("Actualización de datos del proveedor con ID: " + idProveedor);
         
         System.out.println("Nuevo nombre :  ");
         this.nombre = scanner.nextLine();
         
         System.out.println("Nuevo telefono: ");
         this.telefono = scanner.nextLine();
         
         System.out.println("Nueva direccion: ");
         this.direccion = scanner.nextLine();
         System.out.println("Datos del proveedor actualizados exitosamente:");
         System.out.println(this);
    }
    public static void Mostrar_Proveedores(){
        if(listaProveedores.isEmpty()){
            System.out.println("No hay proveedores registrados: ");
            
        }else{
            System.out.println("Lista de proveedores registrados: ");
            for(Proveedor proveedor:listaProveedores){
                System.out.println(proveedor);
            }
           
        }
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }
     public static Proveedor buscarProveedorPorId(int idProveedor) {
        for (Proveedor proveedor : listaProveedores) {
            if (proveedor.idProveedor == idProveedor) {
                return proveedor;
            }
        }
        return null;
    }

   
    
    
}
