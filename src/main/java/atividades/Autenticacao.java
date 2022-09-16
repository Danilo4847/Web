package atividades;

import model.controller.Usuario;
import model.entity.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "autenticacao", value = "/autenticacao")
public class Autenticacao extends HttpServlet {
    private ArrayList<String> users;

    public void init() {
        users = new ArrayList<String>();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	
    	
        
    	response.setContentType("text/html");
        
    	String user= request.getParameter("user");
        String senha = request.getParameter("senha");
        String logado = request.getParameter("logado");

        if((user.equals("Danilo")) && senha.equals("123456")) {

            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            User newUser = new User(user, session);

            if (!Usuario.checkIfUserExist(user)) {
                Usuario.addUser(newUser);
            } else {
                Usuario.updateSession(newUser);
            }

            if(logado != null) {
                Cookie ck = new Cookie("logado", user);
                ck.setMaxAge(60*60*24*7);
                response.addCookie(ck);
            }

            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }else{
            response.sendRedirect(request.getContextPath() + "/login.jsp");
        }

    }

    
}