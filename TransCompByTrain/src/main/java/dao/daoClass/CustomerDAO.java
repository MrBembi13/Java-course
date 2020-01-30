package dao.daoClass;

import dao.ICustomerDAO;
import model.company.person.CustomerModel;
import org.apache.ibatis.session.SqlSession;
import util.OpenSession;

import java.util.List;

public class CustomerDAO implements ICustomerDAO{
    private ICustomerDAO entityDAO;
    private Class<ICustomerDAO> DAOClass = ICustomerDAO.class;

    @Override
    public CustomerModel getCustomerById(Long id) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        CustomerModel entity =  entityDAO.getCustomerById(id);
        session.close();
        return entity;
    }

    @Override
    public List<CustomerModel> getCustomerList() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<CustomerModel> entities =  entityDAO.getCustomerList();
        session.close();
        return entities;
    }

    @Override
    public void insertCustomer(CustomerModel entity) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertCustomer(entity);
        session.commit();
        session.close();
    }

    @Override
    public void deleteCustomer(CustomerModel entity) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteCustomer(entity);
        session.commit();
        session.close();
    }

    @Override
    public void updateCustomer(CustomerModel entity) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateCustomer(entity);
        session.commit();
        session.close();
    }
}
