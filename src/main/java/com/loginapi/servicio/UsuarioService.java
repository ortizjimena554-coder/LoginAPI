package com.loginapi.servicio;

import com.loginapi.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 * Servicio encargado de registrar y autenticar usuarios
 */
public class UsuarioService {

    private static List<Usuario> usuarios = new ArrayList<>();

    // Registrar usuario
    public String registrar(Usuario usuario) {

        usuarios.add(usuario);

        return "Usuario registrado correctamente";
    }

    // Iniciar sesión
    public String login(String usuario, String contrasena) {

        for (Usuario u : usuarios) {

            if (u.getUsuario().equals(usuario)
                    && u.getContrasena().equals(contrasena)) {

                return "Autenticación satisfactoria";
            }
        }

        return "Error en la autenticación";
    }
}
