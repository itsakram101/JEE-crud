package youcode.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import youcode.entities.Address;
import youcode.entities.Employee;
import youcode.serviceImpl.EmployeeServiceImpl;
import youcode.serviceInterfaces.EmployeeService;
import org.hibernate.HibernateException;
import java.sql.Date;
import javax.servlet.annotation.*;

import java.io.IOException;

public class addEmployee extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/add.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");
        String entryDate = (request.getParameter("entry_date"));

        String country = request.getParameter("country");
        String city = request.getParameter("city");
        String street = request.getParameter("street");
        String postalCode = request.getParameter("postalcode");

        if(entryDate  == null || country  == null || city  == null || street  == null || postalCode == null){
            response.sendRedirect(request.getContextPath() + "/add");
        }else {
            EmployeeService employeeService = new EmployeeServiceImpl();

            try {
                Address address = new Address();
                address.setStreet(street);
                address.setCountry(country);
                address.setCity(city);
                address.setPostalCode(Integer.parseInt(postalCode));


                Employee employee = new Employee();
                employee.setName(name);
                employee.setEntryDate(entryDate);
                employeeService.add(employee);
                response.sendRedirect(request.getContextPath()+"/home");
            }catch (HibernateException e){
                e.printStackTrace();
            }
        }

    }
}
