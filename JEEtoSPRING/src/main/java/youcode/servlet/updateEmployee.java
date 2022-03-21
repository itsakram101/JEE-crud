package youcode.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.HibernateException;
import youcode.entities.Address;
import youcode.entities.Employee;
import youcode.serviceImpl.AddressServiceImpl;
import youcode.serviceImpl.AdminServiceImpl;
import youcode.serviceImpl.EmployeeServiceImpl;
import youcode.serviceInterfaces.AdminService;
import youcode.serviceInterfaces.EmployeeService;

import java.io.IOException;
import java.sql.Date;

public class updateEmployee extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long id_user = Long.parseLong(request.getParameter("id"));
        EmployeeService employeeService = new EmployeeServiceImpl();
        Employee employee = employeeService.Find(id_user);
        request.setAttribute("employee",employee);
        this.getServletContext().getRequestDispatcher("/update.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        String entryDate = request.getParameter("entry_date");
        String country = request.getParameter("country");
        String city = request.getParameter("city");
        String street = request.getParameter("street");
        String postalCode = request.getParameter("postalcode");
        if(entryDate  == null || country  == null || city  == null || street  == null || postalCode == null){
            response.sendRedirect(request.getContextPath() + "/add");
        }else {
            EmployeeService employeeService = new EmployeeServiceImpl();

            try {
                // Address
                Address address = new Address();
                address.setStreet(street);
                address.setCountry(country);
                address.setCity(city);
                address.setPostalCode(Integer.parseInt(postalCode));
                // Employee
                Employee employee = new Employee();
                employee.setName(name);
                employee.setEntryDate((entryDate));
                employee.setAddress(new AddressServiceImpl().getAll().get(0));
                employeeService.update(employee);
                response.sendRedirect(request.getContextPath()+"/home");
            }catch (HibernateException e){
//                e.printStackTrace();

            }
        }
    }
}
