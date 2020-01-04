import company.person.Customer;
import util.iokeyboard.InputKeyboard;
import util.iokeyboard.WriteFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Executor {

    public static void main(String[] args) {
        FileInputStream fis;
        Properties properties = new Properties();
        String fileName = "D:\\test_auto_course\\git\\Java-course\\TransCompByTrain\\src\\main\\resources\\customer.properties";
        try {
            fis = new FileInputStream("src/main/resources/customer.properties");
            Customer customer1 = new Customer();
            InputKeyboard inputKeyboard = new InputKeyboard();
            properties.load(fis);

            System.out.println("Enter your Name:");
            customer1.setName(inputKeyboard.inputString());

            System.out.println("Enter your Surname:");
            customer1.setSurname(inputKeyboard.inputString());
            WriteFile.write(fileName, "name = " + customer1.getName() + "\nsurname = " + customer1.getSurname());

        } catch (IOException e){
            System.err.println("error");
        }

        properties.getProperty("name");
        properties.getProperty("surname");
    }
}