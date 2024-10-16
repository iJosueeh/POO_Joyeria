/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package joyeria.interfaces;

import joyeria.modelo.usuarios.Usuario;


public interface IUsuario {
    public void registrarUsuario(Usuario usuario);
    public void modificarPerfil();
    public Boolean verificarUsuario(String correo, String contraseña);
    public void eliminarUsuario(Usuario usuario);
}
