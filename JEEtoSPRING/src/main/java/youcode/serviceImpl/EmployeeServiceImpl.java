package youcode.serviceImpl;

import youcode.daoImpl.EmployeeDaoImpl;
import youcode.daoInterface.EmployeeDao;
import youcode.entities.Employee;
import youcode.serviceInterfaces.EmployeeService;
import youcode.serviceInterfaces.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private youcode.daoInterface.EmployeeDao EmployeeDao = new EmployeeDaoImpl();
    @Override
    public Employee add(Employee Employee) {
        return EmployeeDao.add(Employee);
    }

    @Override
    public Employee Find(long id) {
        return EmployeeDao.find(id);
    }

    @Override
    public List<Employee> getAll() {
        return EmployeeDao.getAll();
    }

    @Override
    public Employee update(Employee Employee) {
        return EmployeeDao.update(Employee);
    }

    @Override
    public boolean delete(long id) {
        return EmployeeDao.delete(id);
    }
}
