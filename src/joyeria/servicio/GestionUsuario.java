/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joyeria.servicio;

import java.util.ArrayList;
import java.util.List;
import joyeria.interfaces.IUsuario;
import joyeria.modelo.usuarios.Cliente;
import joyeria.modelo.usuarios.Usuario;

public class GestionUsuario implements IUsuario {

    private List<Cliente> listaCliente;

    public GestionUsuario() {
        this.listaCliente = new ArrayList<>();
    }

    public GestionUsuario(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente != null ? listaCliente : new ArrayList<>();
    }

    @Override
    public Cliente buscarClientePorId(int idCliente, List<Cliente> listaCliente) {
        for (Cliente cliente : listaCliente) {
            if (cliente.getIdUsuario() == idCliente) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public Cliente buscarClientePorNombre(String nombreCliente) {
        if (listaCliente == null || listaCliente.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return null;
        }

        for (Cliente cliente : listaCliente) {
            if (cliente.getNombre().equalsIgnoreCase(nombreCliente)) {
                return cliente; 
            }
        }

        System.out.println("No se encontró ningún cliente con el nombre: " + nombreCliente);
        return null;
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
    }

    @Override
    public void modificarPerfil() {
    }

    @Override
    public Boolean verificarUsuario(String correo, String contraseña) {
        return true;
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
    }
}
