/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joyeria.servicio;

import java.util.List;
import joyeria.modelo.usuarios.Cliente;

public class GestionUsuario {

    public Cliente buscarClientePorId(int idCliente, List<Cliente> listaCliente) {
        for (Cliente cliente : listaCliente) {
            if (cliente.getIdUsuario() == idCliente) {
                return cliente;
            }
        }
        return null;
    }
}
