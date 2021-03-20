
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio_4", urlPatterns = {"/Ejercicio_4"})
public class Ejercicio_4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio_4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Conversion de Moneda</h1>");
            out.println("<h2>6.91 Bs. = 1 Dolar</h2>");
            out.println("<form action = 'Ejercicio_4_proceso' method='post'>");
            
            out.println("<label>Bolivianos a Dolares </label>");
            out.println("<input type='number' step = 'any' name='bolivianos' min='0'>");
            out.println("<br>");
            out.println("<br>");
            out.println("<label>Dolares a Bolivianos: </label>");
            out.println("<input type='number' step = 'any' name = 'dolares' min='0'>");
            
            out.println("<br>");
            out.println("<br>");
            out.println("<input type='submit' value='Comvertir'>");
            
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
