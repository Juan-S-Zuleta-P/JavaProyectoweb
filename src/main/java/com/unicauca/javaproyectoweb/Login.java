package com.unicauca.javaproyectoweb;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import static java.lang.System.out;


@WebServlet(name="login", value="/login" )
public class Login extends HttpServlet {

    //throws Object IOException;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)

    throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");

        // Redirigir según la lógica de autenticación (aquí se redirige a una página de bienvenida)
        if (usuario.equals("juan") && contrasena.equals("abc")) {
            // Almacenar el nombre de usuario en la sesión
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usuario);

            // Redirigir a la página de bienvenida
            response.sendRedirect("hello-servlet");
            //response.sendRedirect("hello-servlet");
        } else {
            response.sendRedirect("fallo-error");
        }
    }
}