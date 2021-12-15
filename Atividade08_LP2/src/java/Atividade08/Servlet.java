/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade08;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author carol
 */
@WebServlet(name = "servlet", urlPatterns = {"/servlet"})
public class Servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        //recuperar através de Strings os parâmetros assunto e mensagem do formulário da página index.jsp;
        String mensagem = request.getParameter("mensagem");
        String assunto = request.getParameter("assunto");
        
        //recuperar da sessão do usuário o objeto chamado lista do tipo ArrayList<Conteudo>.
        HttpSession sessao = request.getSession();
        ArrayList<Conteudo> lista = (ArrayList<Conteudo>) sessao.getAttribute("lista");

        //caso o objeto lista tenha valor null então criar o objeto lista do tipo ArrayList<Conteudo>.
        if (lista == null) 
        {
            lista = new ArrayList<Conteudo>();
        }
        
        //criar o objeto conteudo da classe Conteudo com os valores recuperados dos parâmetros do formulário da página index.jsp
        Conteudo conteudo = new Conteudo();
        conteudo.setAssunto(assunto);
        conteudo.setMensagem(mensagem);

        //adicionar o objeto conteudo dentro do objeto lista ArrayList<Conteudo>.
        lista.add(conteudo);
        
        //ncluir o objeto lista na seção do usuário.
        sessao.setAttribute("lista", lista);

        //encaminhar o usuário para página listar.jsp
        response.sendRedirect(request.getContextPath() + "/listar.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
