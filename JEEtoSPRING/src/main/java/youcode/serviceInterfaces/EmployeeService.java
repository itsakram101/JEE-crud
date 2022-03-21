package youcode.serviceInterfaces;

import youcode.entities.Employee;

import java.util.List;

public interface EmployeeService {
    Employee add(Employee employee);
    Employee Find(long id);
    List<Employee> getAll();
    Employee update(Employee employe);
    boolean delete(long id);
}
