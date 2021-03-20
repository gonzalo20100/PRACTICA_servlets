
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio_2", urlPatterns = {"/Ejercicio_2"})
public class Ejercicio_2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio 2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Ingrese un numero</h1>");
            
            out.println("<form action = 'Ejercicio_2_proceso' method='post'>");
            
            out.println("<label>Numero: </label>");
            out.println("<input type='text' name='numero'>");
            out.println("<br>");
            out.println("<br>");
            out.println("<input type='submit' value='Calcular Factorial'>");
            
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
