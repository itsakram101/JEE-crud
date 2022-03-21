package youcode.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import youcode.entities.Employee;
import youcode.serviceImpl.AdminServiceImpl;
import youcode.serviceImpl.EmployeeServiceImpl;
import youcode.serviceInterfaces.AdminService;
import youcode.serviceInterfaces.EmployeeService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name = "dashboard",value = "/dashboard")
public class dashboard extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        EmployeeService employeeService = new EmployeeServiceImpl();
        ArrayList<Employee> getAllEmployees = (ArrayList<Employee>) employeeService.getAll();
        System.out.println(getAllEmployees+"ho");
        request.setAttribute("employees", getAllEmployees);
        this.getServletContext().getRequestDispatcher("/dashboard.jsp").forward(request, response);
        //request.getRequestDispatcher("/dashboard").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
