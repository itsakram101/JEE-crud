package youcode.servlet;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import youcode.serviceImpl.AdminServiceImpl;
import youcode.serviceInterfaces.AdminService;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        AdminService adminService = new AdminServiceImpl();
        if(adminService.login(email, password)){
            response.sendRedirect(request.getContextPath() + "/home");
        }else{
            response.sendRedirect(request.getContextPath() + "/login");
        }

    }
}
