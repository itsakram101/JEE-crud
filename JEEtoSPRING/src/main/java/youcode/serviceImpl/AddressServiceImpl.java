package youcode.serviceImpl;

import youcode.daoImpl.AddressDaoImpl;
import youcode.daoInterface.AddressDao;
import youcode.entities.Address;
import youcode.serviceInterfaces.AddressService;

import java.util.List;

public class AddressServiceImpl implements AddressService {
    private AddressDao addressDao = new AddressDaoImpl();
    @Override
    public Address add(Address address) {
        return addressDao.add(address);
    }

    @Override
    public Address Find(long id) {
        return  addressDao.find(id);
    }

    @Override
    public List<Address> getAll() {
        return addressDao.getAll();
    }

    @Override
    public Address update(Address address) {
        return addressDao.update(address);
    }

    @Override
    public boolean delete(long id) {
        return addressDao.delete(id);
    }
}
