
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio_2_proceso", urlPatterns = {"/Ejercicio_2_proceso"})
public class Ejercicio_2_proceso extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String num = request.getParameter("numero");
       
                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio 2 proceso</title>");            
            out.println("</head>");
            out.println("<body>");
            
            if (num.equals("")) {
                out.println("<p>NO SE ENVIO NINGUN VALOR</p>");
            }else{
                int factorial=1;
                int numero = Integer.parseInt(num);
                for (int i = numero; i > 0 ; i--) {
                    factorial = factorial *i;
                }
            out.println("<h1>El factorial del numero " + numero + " es: "+factorial+"</h1>");            
            }
            
            out.println("<a href=Ejercicio_2>Volver a la pagina de llenado</a>");
            out.println("<br><br>");
            out.println("<a href=Main>Ir a la pagina de seleccion de ejercicio</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
