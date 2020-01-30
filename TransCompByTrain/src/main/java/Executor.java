import dao.daoClass.PersonDAO;
import model.company.person.PersonModel;

import java.util.List;

public class Executor {

    public static void main(String[] args) {

        List<PersonModel> personList = new PersonDAO().getPersonList();
        for (PersonModel c: personList) {
            System.out.println(c);
        }
    }
}