/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joyeria.menus.usuarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import joyeria.modelo.usuarios.Usuario;

public class GestionUsuario {

    private List<Usuario> usuarios;
    private static int idCliente = 1; 

    public GestionUsuario() {
        usuarios = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario) {
        usuario.setIdUsuario(idCliente++);
        usuarios.add(usuario);
    }

    public void modificarPerfil(int idUsuario, String nuevoNombre, String nuevoCorreo) {
        Usuario usuario = buscarUsuario(idUsuario);
        if (usuario != null) {
            usuario.setNombre(nuevoNombre);
            usuario.setCorreo(nuevoCorreo);
        }
    }

    public boolean verificarUsuario(String correo, String password) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreo().equals(correo) && usuario.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public void eliminarUsuario(int idUsuario) {
        Usuario usuario = buscarUsuario(idUsuario);
        if (usuario != null) {
            usuarios.remove(usuario);
        }
    }

    private Usuario buscarUsuario(int idUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario() == idUsuario) {
                return usuario;
            }
        }
        return null;
    }

    public void mostrarMenu(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}