
package joyeria.modelo.productos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Cupon {
    private int idCupon;
    private String codigo;
    private String valorDescuento;
    private LocalDate fechaExpiracion;
    private Map<String, Cupon> listaCupones;

    public Cupon(int idCupon, String codigo, String valorDescuento, LocalDate fechaExpiracion, Map<String, Cupon> listaCupones) {
        this.idCupon = idCupon;
        this.codigo = codigo;
        this.valorDescuento = valorDescuento;
        this.fechaExpiracion = fechaExpiracion;
        this.listaCupones = new HashMap<>();
        
    }
    public boolean validarcupon(){
        return !LocalDate.now().isAfter(fechaExpiracion);
        
    }
    public double aplicarcupon(double total){
        if(validarcupon()){
            double descuento= Double.parseDouble(valorDescuento.replace("%", ""))/100;
            return total-(total*descuento);
        }else{
            System.out.println("El cupon ha expirado");
            return total;
        }
    }

    public int getIdCupon() {
        return idCupon;
    }

    public void setIdCupon(int idCupon) {
        this.idCupon = idCupon;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(String valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(LocalDate fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public Map<String, Cupon> getListaCupones() {
        return listaCupones;
    }

    public void setListaCupones(Map<String, Cupon> listaCupones) {
        this.listaCupones = listaCupones;
    }
    
    
}
