
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio_5", urlPatterns = {"/Ejercicio_5"})
public class Ejercicio_5 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio_5</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>OPERACIONES CON DOS NUMEROS</h1>");
            
            out.println("<form action = 'Ejercicio_5'>");
            
            out.println("<label>Primer numero: </label>");
            out.println("<input type='number' name = 'primero'>");
            
            out.println("<br><br>");
		out.println("<label for='op'>Seleccione operador</label><br>");
		out.println("<select name='operador' id='op'>");
			out.println("<option value='+'>SUMA +</option>");
			out.println("<option value='-'>RESTA -</option>");
			out.println("<option value='*'>MULTIPLICAION *</option>");
                        out.println("<option value='/'>DIVISION /</option>");
		out.println("</select>");
		out.println("<br><br>");
            
            out.println("<label>Segundo numero: </label>");
            out.println("<input type='number' name = 'segundo'>");
            out.println("<br><br>");
            out.println("<input type='submit' value='Calcular la Operacion'>");
            
            out.println("</form>");
            
            String pri = request.getParameter("primero");
            int prim = Integer.parseInt(pri);
            String seg = request.getParameter("segundo");
            int segu = Integer.parseInt(seg);
            String oper = request.getParameter("operador");
            
            if (oper.equals("+")) {
                out.println("<p>Resultado:"+(prim+segu)+"</p>");
            }else{
                if (oper.equals("-")) {
                    out.println("<p>Resultado:"+(prim-segu)+"</p>");
                }else{
                   if (oper.equals("*")) {
                    out.println("<p>Resultado:"+(prim*segu)+"</p>");
                    }else{
                       if (oper.equals("/")) {
                        out.println("<p>Resultado:"+(prim/segu)+"</p>");
                        }
                   }
                }
            }
            
            out.println("<a href=Main>Ir a la pagina de seleccion de ejercicio</a>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }
}
