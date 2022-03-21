package youcode.daoInterface;

import youcode.entities.Employee;

import java.util.List;

public interface EmployeeDao {

    Employee add(Employee employee);
    Employee find(long id);
    List<Employee> getAll();
    Employee update(Employee employee);
    boolean delete(long id);
}
