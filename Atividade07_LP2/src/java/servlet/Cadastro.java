package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "cadastro", urlPatterns = {"/cadastro"})
public class Cadastro extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Cadastro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Cadastro at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nome = request.getParameter("name");
        String endereco = request.getParameter("address");
        String bairro = request.getParameter("district");
        String cidade = request.getParameter("city");
        String cep = request.getParameter("cep");
        String telefone = request.getParameter("telephone");
                
         if((nome.equals(null)) || (endereco.equals(null)) || (bairro.equals(null)) || (cidade.equals(null)) || (cep.equals(null)) || (telefone.equals(null)))
        {
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        } else
         {
            response.getWriter().println("Cadastro realizado com sucesso!");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
