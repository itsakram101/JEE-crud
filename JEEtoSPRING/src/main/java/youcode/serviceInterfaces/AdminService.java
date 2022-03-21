package youcode.serviceInterfaces;

import youcode.entities.Admin;

import java.util.List;

public interface AdminService {
    Admin add(Admin admin);
    Admin Find(long id);
    List<Admin> getAll();
    Admin update(Admin admin);
    boolean delete(long id);

    boolean login(String email,String password);
    boolean changePassword(String olPassword,String newPassword);
}
