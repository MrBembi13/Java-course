package mappers;

import company.person.Person;

import java.util.List;

public interface PersonMapper {
    Person getPersonByID (Integer id);

    List<Person> getPersons();
}
