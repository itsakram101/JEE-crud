package youcode.daoImpl;

import org.hibernate.Session;
import youcode.daoInterface.AddressDao;
import youcode.entities.Address;
import youcode.hibernate.HibernateFactory;

import java.util.List;

public class AddressDaoImpl implements AddressDao {

    @Override
    public Address add(Address address) {
        Session session = HibernateFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        session.save(address);
        session.getTransaction().commit();
        session.close();
        return address;
    }

    @Override
    public Address find(long id) {
        Session session = HibernateFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        Address address = session.get(Address.class,id);
        session.close();
        return address;
    }

    @Override
    public List<Address> getAll() {
        Session session = HibernateFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        List<Address> addresss = session.createCriteria(Address.class).list();
        session.close();
        return addresss;
    }

    @Override
    public Address update(Address address) {
        Session session = HibernateFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        session.find(Address.class,address.getIdAddress());
        session.merge(address);
        session.getTransaction().commit();
        session.close();
        return address;
    }

    @Override
    public boolean delete(long id) {
        Session session = HibernateFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        Address address = session.load(Address.class,id);
        session.delete(address);
        session.getTransaction().commit();
        return true;
    }
}
