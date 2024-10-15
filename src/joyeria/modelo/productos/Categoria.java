
package joyeria.modelo.productos;

import java.util.HashSet;
import java.util.Set;

public class Categoria {
   private int idCategoria;
   private String nombre;
   private Set <Producto> productos;

    public Categoria(int idCategoria, String nombre, Set<Producto> productos) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.productos = new HashSet<>();//almacenar sin duplicados
        
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }
    
    
    public void Agregar_P(Producto producto){
        productos.add(producto);
        System.out.println("Producto agregado a la categoria "+ nombre+ ":"+ producto.getNombre());
        
    }
    public void Eliminar_P(Producto producto) {
        if (productos.contains(producto)) {//verifica si existe
            productos.remove(producto);
            System.out.println("Producto eliminado de la categoria " + nombre + ": " + producto.getNombre());
        } else {
            System.out.println("El producto no se encuentra en la categoria.");
        }
    }
   //metodo para obtener un conjunto de productos en la categoria
     public Set<Producto> obtenerProductos() {
        return productos;
     }
     public void imprimir(){
         System.out.println("Productos de la categoria"+ nombre+":");
         for(Producto producto: productos){
             System.out.println(producto.getNombre());
         }
     }
     
}
