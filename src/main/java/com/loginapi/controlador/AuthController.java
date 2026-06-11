package com.loginapi.controlador;

import com.loginapi.modelo.Usuario;
import com.loginapi.servicio.UsuarioService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

/**
 * API REST para registro e inicio de sesión
 */

@Path("/auth")
public class AuthController {

    UsuarioService servicio = new UsuarioService();

    @POST
    @Path("/registro")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)

    public String registrar(Usuario usuario) {

        return servicio.registrar(usuario);
    }

    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)

    public String login(Usuario usuario) {

        return servicio.login(
                usuario.getUsuario(),
                usuario.getContrasena()
        );
    }
}