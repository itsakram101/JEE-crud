package youcode.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import youcode.daoImpl.EmployeeDaoImpl;
import youcode.daoInterface.EmployeeDao;
import youcode.entities.Employee;
import youcode.serviceImpl.EmployeeServiceImpl;
import youcode.serviceInterfaces.EmployeeService;

import java.io.IOException;
import java.util.ArrayList;
@WebServlet(name = "deleteEmployee", value = "/deleteEmployee")

public class deleteEmployee extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        long id = Integer.parseInt(request.getParameter("id"));
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        if(employeeDao.delete(id)){

            response.sendRedirect(request.getContextPath() + "/home");
        }else {

            response.sendRedirect(request.getContextPath() + "/home");
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
