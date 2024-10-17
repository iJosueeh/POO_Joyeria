/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package joyeria.interfaces;

import joyeria.modelo.pedidos.Pedido;

public interface IGestionPedido {
    public void realizarPedido(Pedido pedido);
    public void cancelarPedido(Pedido pedido);
}
