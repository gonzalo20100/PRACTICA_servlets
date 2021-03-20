
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio_3", urlPatterns = {"/Ejercicio_3"})
public class Ejercicio_3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio 3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>CALCULANDO LA EDAD DEL USUARIO</h1>");
            
            out.println("<form action = 'Ejercicio_3'>");
            
            out.println("<label>Anio de nacimiento: </label>");
            out.println("<input type='number' name = 'anio_nacimiento' min='0' max='2020'>");
            
            out.println("<br>");
            out.println("<br>");
            out.println("<input type='submit' value='Calcular Edad'>");
            
            out.println("</form>");
            
            String anio = request.getParameter("anio_nacimiento");
            int edad = 2021-Integer.parseInt(anio);
            out.println("<p>Edad:"+edad+"</p>");
            out.println("<br><br>");
            out.println("<a href=Main>Ir a la pagina de seleccion de ejercicio</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
