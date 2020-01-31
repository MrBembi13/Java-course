import dao.daoClass.CustomerDAO;
import dao.daoClass.PersonDAO;
import model.company.person.CustomerModel;
import model.company.person.PersonModel;
import util.jackson.PojoToJson;

import java.io.IOException;
import java.util.List;

public class Executor {

    public static void main(String[] args) throws IOException {
        //to json file by id
        PojoToJson<PersonModel> pojoToJson = new PojoToJson<>();
        PersonModel personModel = new PersonDAO().getPersonById((long)1);
        pojoToJson.toJson(personModel,"src\\main\\resources\\json\\person.json");

        //to json file by List
        List<PersonModel> personModelList = new PersonDAO().getPersonList();
        pojoToJson.toJson(personModelList, "src\\main\\resources\\json\\person1.json");

        //from json file by id
        PojoToJson<PersonModel> pojoToJson1 = new PojoToJson<>();
        PersonModel customerModel = pojoToJson1.fromJson("src\\main\\resources\\json\\person.json");
        System.out.println(customerModel);
        PersonDAO customerDAO = new PersonDAO();
        customerDAO.insertPerson(customerModel);
    }
}