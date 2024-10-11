/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joyeria.menus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import joyeria.modelo.usuarios.Usuario;

public class UsuariosMenu {

    private Map<Integer, Usuario> usuariosRegistrados;
    private int idUsuario;

    public UsuariosMenu() {
        usuariosRegistrados = new HashMap<>();
        idUsuario = 1;
    }

    public void mostrarMenu(Scanner scanner) {
        if (!menuUsuario(scanner)) {
            return;
        }

        boolean continuarMenu = true;

        do {
            System.out.println("\n>>==========================================<<");
            System.out.println("    Menú de Usuario - Joyas del Corazín");
            System.out.println(">>==========================================<<\n");
            System.out.println("→ [1] Ver Productos");
            System.out.println("→ [2] Ver Carrito de Compras");
            System.out.println("→ [3] Ver Historial de Compras");
            System.out.println("→ [4] Gestionar perfil");
            System.out.println("→ [5] Canjear Cupones");
            System.out.println("→ [6] Ver Reseñas de Productos");
            System.out.println("→ [7] Volver al Menú Principal");
            System.out.println("→ [8] Cerrar Programa");
            System.out.print("Seleccione su opción: ");
            int opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.println("Mostrando productos...");
                    break;
                case 2:
                    System.out.println("Ver carrito de compras...");
                    break;
                case 3:
                    System.out.println("Ver historial de compras...");
                    break;
                case 4:
                    System.out.println("Gestionar perfil...");
                    break;
                case 5:
                    System.out.println("Canjeando cupon...");
                    break;
                case 6:
                    System.out.println("Viendo reseñas de productos...");
                    break;
                case 7:
                    System.out.println("Volviendo al menú principal..\n");
                    continuarMenu = false;
                    break;
                case 8:
                    System.out.println("Cerrando programa, vuelva pronto!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no valida, ingrese el número indicado.");
            }

        } while (continuarMenu);
    }

    private boolean menuUsuario(Scanner scanner) {
        System.out.println(">>==========================================<<");
        System.out.println("    Bienvenido al sistema de Usuarios");
        System.out.println(">>==========================================<<\n");
        System.out.println("→ [1] Iniciar Sesión");
        System.out.println("→ [2] Registrarse\n");
        System.out.print("Seleccione su opción: ");
        int opcionUsuario = scanner.nextInt();

        switch (opcionUsuario) {
            case 1:
                return iniciarSesion(scanner);
            case 2:
                return registrarUsuario(scanner);
            default:
                System.out.println("Opción no valida.");
                return false;
        }
    }

    private boolean iniciarSesion(Scanner scanner) {
        System.out.println("\n>>=================================<<");
        System.out.println("    Iniciando sesión de usuario");
        System.out.println(">>=================================<<\n");

        System.out.print("Ingresa su nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Ingresa su contraseña: ");
        String contraseñaUsuario = scanner.nextLine();

        // Verificando si el nombre de usuario existe y la contraseña es correcta
        for (Usuario usuario : usuariosRegistrados.values()) {
            if (usuario.getNombre().equals(nombreUsuario) && usuario.getContraseña().equals(contraseñaUsuario)) {
                System.out.println("Inicio de Sesión exitoso.");
                return true;
            }
        }

        System.out.println("Nombre de usuario y/o contraseña incorrecto.");
        return false;
    }

    private boolean registrarUsuario(Scanner scanner) {
        scanner.nextLine();

        System.out.println("\n>>================================<<");
        System.out.println("    Registrando nuevo usuario");
        System.out.println(">>================================<<\n");

        System.out.print("Ingrese un nombre de usuario: ");
        String nuevoNombre = scanner.nextLine();

        for (Usuario usuario : usuariosRegistrados.values()) {
            if (usuario.getNombre().equals(nuevoNombre)) {
                System.out.println("Nombre de usuario ya registrado.");
                return false;
            }
        }

        System.out.print("Ingresa una nueva contraseña: ");
        String nuevaContraseña = scanner.nextLine();

        Usuario nuevoUsuario = new Usuario(idUsuario, nuevoNombre, nuevaContraseña);
        usuariosRegistrados.put(idUsuario, nuevoUsuario);

        idUsuario++;

        System.out.println("Usuario registrado correctamente, ya puede iniciar sesión.\n");
        return iniciarSesion(scanner);
    }

}
