
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio_4_proceso", urlPatterns = {"/Ejercicio_4_proceso"})
public class Ejercicio_4_proceso extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String boliviano = request.getParameter("bolivianos");
        //int bs = Integer.parseInt(boliviano);
        String dolar = request.getParameter("dolares");
        //int sus = Integer.parseInt("dolar");
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio_4_proceso</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultados de la Conversion de Divisas</h1>");
            if (boliviano.equals("") && dolar.equals("")) {
                out.println("<p>NO ENVIO VALORES PARA CONVERTIR</p>");
            }else{
                if (boliviano.equals("")) {
                    double sus = 6.91*Integer.parseInt(dolar);
                    
                    out.println("<label>La conversion de Dolares:"+dolar+" $u$ a Bolivianos es:</label>");
                    out.println("<h3>"+ String.format("%.2f", sus) +" Bs. </h3>");
                }else{
                    if (dolar.equals("")) {
                        double bs = 0.14*Integer.parseInt(boliviano);                   
                        out.println("<label>La conversion de Bolivianos:"+boliviano+" Bs. a Dolares es:</label>");
                        out.println("<h3>"+ String.format("%.2f", bs) +" $u$ </h3>");
                    }else{
                        double bs = 0.14*Integer.parseInt(boliviano);                   
                        out.println("<label>La conversion de Bolivianos:"+boliviano+" Bs. a Dolares es:</label>");
                        out.println("<h3>"+ String.format("%.2f", bs) +" $u$ </h3>");
                        
                        double sus = 6.91*Integer.parseInt(dolar);                   
                        out.println("<label>La conversion de Dolares:"+dolar+" $u$ a Bolivianos es:</label>");
                        out.println("<h3>"+ String.format("%.2f", sus) +" Bs. </h3>");
                    }
                }
            }
            out.println("<a href=Ejercicio_4>Volver a la pagina de llenado</a>");
            out.println("<br><br>");
            out.println("<a href=Main>Ir a la pagina de seleccion de ejercicio</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
