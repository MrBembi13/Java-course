package dao.daoClass;

import dao.IPersonDAO;
import model.company.person.PersonModel;
import org.apache.ibatis.session.SqlSession;
import util.OpenSession;

import java.util.List;

public class PersonDAO implements IPersonDAO{
    private IPersonDAO entityDAO;
    private Class<IPersonDAO> DAOClass = IPersonDAO.class;

    @Override
    public PersonModel getPersonById(Long id) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        PersonModel entity =  entityDAO.getPersonById(id);
        session.close();
        return entity;
    }

    @Override
    public List<PersonModel> getPersonList() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<PersonModel> entities =  entityDAO.getPersonList();
        session.close();
        return entities;
    }

    @Override
    public void insertPerson(PersonModel entity) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertPerson(entity);
        session.commit();
        session.close();
    }

    @Override
    public void deletePerson(PersonModel entity) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deletePerson(entity);
        session.commit();
        session.close();
    }

    @Override
    public void updatePerson(PersonModel entity) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updatePerson(entity);
        session.commit();
        session.close();
    }
}
