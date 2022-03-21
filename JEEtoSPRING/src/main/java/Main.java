import org.hibernate.Session;
import org.hibernate.SessionFactory;
import youcode.daoImpl.EmployeeDaoImpl;
import youcode.entities.Employee;
import youcode.hibernate.HibernateFactory;
import youcode.serviceImpl.EmployeeServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
       Session sessionFactory = HibernateFactory.getInstance().getSession().openSession();
        //EmployeeDaoImpl o = new EmployeeDaoImpl();
        //o.getAll();
        //System.out.println(a);
        // System.out.println((ArrayList<Employee>)new EmployeeServiceImpl().getAll());
    }
}
