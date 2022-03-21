package youcode.serviceInterfaces;

import youcode.entities.Address;

import java.util.List;

public interface AddressService {
    Address add(Address address);
    Address Find(long id);
    List<Address> getAll();
    Address update(Address address);
    boolean delete(long id);
}
