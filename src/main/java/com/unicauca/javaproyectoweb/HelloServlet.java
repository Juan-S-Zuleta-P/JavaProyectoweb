package com.unicauca.javaproyectoweb;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Bienvenido" ;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // Obtener el nombre de usuario desde la sesión
        HttpSession session = request.getSession();
        String usuario = (String) session.getAttribute("usuario");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + " " + usuario + "</h1>");
        out.println("</body></html>");

    }

    public void destroy() {
    }
}