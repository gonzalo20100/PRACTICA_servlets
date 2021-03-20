
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio_1", urlPatterns = {"/Ejercicio_1"})
public class Ejercicio_1 extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio 1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos del usuario</h1>");
            
            out.println("<form action = 'Ejercicio_1_proceso' method='post'>");
            
            out.println("<label>Nombre: </label>");
            out.println("<input type='text' name='nombre'>");
            out.println("<br>");
            out.println("<br>");
            out.println("<label>Anio de nacimiento: </label>");
            out.println("<input type='number' name = 'anio_nacimiento' min='0' max='2020'>");
            
            out.println("<br>");
            out.println("<br>");
            out.println("<input type='submit' value='Calcular Edad'>");
            
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
