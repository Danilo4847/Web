package atividades;



import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "logout", value = "/logout")
public class Saida extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        HttpSession session = request.getSession();

     
        session.setAttribute("user", null);

        Cookie ck = new Cookie("logado", "");
        ck.setMaxAge(0);
        response.addCookie(ck);

        response.sendRedirect(request.getContextPath() + "/login.jsp");

    }

    
}