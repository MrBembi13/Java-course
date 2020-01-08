import company.person.Customer;
import util.iokeyboard.InputKeyboard;
import util.iokeyboard.WriteFile;
import util.properties.DoProperties;

public class Executor {

    public static void main(String[] args) {
        String fileName = "D:\\test_auto_course\\git\\Java-course\\TransCompByTrain\\src\\main\\resources\\customer.properties";

        Customer customer1 = new Customer();
        InputKeyboard inputKeyboard = new InputKeyboard();

        System.out.println("Enter your Name:");
        customer1.setName(inputKeyboard.inputString());

        System.out.println("Enter your Surname:");
        customer1.setSurname(inputKeyboard.inputString());
        WriteFile.write(fileName, "name = " + customer1.getName() + "\nsurname = " + customer1.getSurname());

        DoProperties.showProperties("src/main/resources/customer.properties");
    }
}