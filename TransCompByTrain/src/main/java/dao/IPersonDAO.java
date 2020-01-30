package dao;

import model.company.person.PersonModel;

import java.util.List;

public interface IPersonDAO {
    PersonModel getPersonByID (Long id);

    List<PersonModel> getPersonList();

    void insertPerson (PersonModel entity);

    void deletePerson (PersonModel entity);

    void updatePerson (PersonModel entity);
}
