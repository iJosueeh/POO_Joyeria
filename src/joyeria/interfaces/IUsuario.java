/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package joyeria.interfaces;

import java.util.List;
import joyeria.modelo.usuarios.Cliente;
import joyeria.modelo.usuarios.Usuario;


public interface IUsuario {
    public void registrarUsuario(Usuario usuario);
    public void modificarPerfil();
    public Boolean verificarUsuario(String correo, String contraseña);
    public void eliminarUsuario(Usuario usuario);
    public Cliente buscarClientePorNombre(String nombreCliente);
    public Cliente buscarClientePorId(int idCliente, List<Cliente> listaCliente);
}
