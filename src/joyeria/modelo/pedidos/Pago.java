/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joyeria.modelo.pedidos;

import java.time.LocalDate;

public class Pago {

    private int idPago;
    private double monto;
    private LocalDate fechaPago;
    private String metodoPago;

    public Pago(int idPago, double monto, LocalDate fechaPago, String metodoPago) {
        this.idPago = idPago;
        this.monto = monto;
        this.fechaPago = fechaPago;
        this.metodoPago = metodoPago;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Boolean ProcesarPago() {
        if (validarMetodoPago()) {
            System.out.println("El pago de " + monto + " fue procesado exitosamente con " + metodoPago);
            return true;
        } else {
            System.out.println("Error: método de pago no válido.");
            return false;
        }
    }

    public Boolean validarMetodoPago() {
        String[] metodosAceptados = {"Tarjeta", "Efectivo", "Transferencia"};
        for (String metodo : metodosAceptados) {
            if (metodo.equalsIgnoreCase(metodoPago)) {
                return true;
            }
        }
        return false;
    }

}
