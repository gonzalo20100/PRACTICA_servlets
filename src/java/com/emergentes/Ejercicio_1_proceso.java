
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter; 
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio_1_proceso", urlPatterns = {"/Ejercicio_1_proceso"})
public class Ejercicio_1_proceso extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String anio = request.getParameter("anio_nacimiento");
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio 1 proceso</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>DATOS RECIBIDOS</h1>");
            if (nombre.equals("") && anio.equals("")) {
              out.println("<h3>NO ENVIO NINGUN DATO</h3>");
            }else{
                if (nombre.equals("")) {
                   int edad = 2021-Integer.parseInt(anio);
                   out.println("<p>NO ESCRIBIO NINGUN DATO EN LA CASILLA DE NOMBRE</p>");
                   out.println("<p>Edad:"+edad+"</p>");
                }else{
                    if (anio.equals("")) {
                        out.println("<p>Nombre: "+nombre+"</p>");
                        out.println("<p>NO ESCRIBIO NINGUN DATO EN LA CASILLA DE ANIO DE NACIMINENTO</p>");
                    }else{
                        int edad = 2021-Integer.parseInt(anio);
                        out.println("<p>Nombre: "+nombre+"</p>");
                        out.println("<p>Edad:"+edad+"</p>");
                    }
                }                
            }
            out.println("<a href=Ejercicio_1>Volver a la pagina de llenado</a>");
            out.println("<br><br>");
            out.println("<a href=Main>Ir a la pagina de seleccion de ejercicio</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
