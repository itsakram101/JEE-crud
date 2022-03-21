package youcode.daoImpl;

import org.hibernate.Session;

import youcode.daoInterface.EmployeeDao;
import youcode.entities.Employee;
import youcode.hibernate.HibernateFactory;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public Employee add(Employee employee) {

        Session session = HibernateFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        session.close();
        return employee;
    }

    @Override
    public Employee find(long id) {

        Session session = HibernateFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        Employee employee = session.find(Employee.class,id);
        session.close();
        return employee;
    }

    @Override
    public List<Employee> getAll() {

        Session session = HibernateFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        List<Employee> employees = session.createCriteria(Employee.class).list();
        //System.out.println(employees);

        return employees;
    }

    @Override
    public Employee update(Employee employee) {

        Session session = HibernateFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        session.load(Employee.class,employee.getIdEmployee());
        session.merge(employee);
        session.getTransaction().commit();
        session.close();
        return employee;
    }

    @Override
    public boolean delete(long id) {

        Session session = HibernateFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        Employee employee = session.find(Employee.class,id);
        session.delete(employee);
        session.getTransaction().commit();
        session.close();
        return true;
    }
}
