
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Main", urlPatterns = {"/Main"})
public class Main extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>MENU</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>MENU DE OPCIONES SELECCIONE UNA</h1>");
            out.println("<a href=Ejercicio_1>Ejercicio 1</a>");
            out.println("<br><br>");
            out.println("<a href=Ejercicio_2>Ejercicio 2</a>");
            out.println("<br><br>");
            out.println("<a href=Ejercicio_3>Ejercicio 3</a>");
            out.println("<br><br>");
            out.println("<a href=Ejercicio_4>Ejercicio 4</a>");
            out.println("<br><br>");
            out.println("<a href=Ejercicio_5>Ejercicio 5</a>");
            //out.println("<br><br>");
           // out.println("<a href=Ejercicio_6>Ejercicio 6</a>");
            //out.println("<br><br>");
            //out.println("<a href=Ejercicio_7>Ejercicio 7</a>");
            out.println("<br><br>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }
}
