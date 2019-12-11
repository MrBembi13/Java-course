package main;

import company.person.Customer;
import company.train.CustomerTrain;
import company.train.LuggageTrain;
import company.train.TrainPark;
import company.transportation.CustomerTransportation;

import java.io.*;
import java.util.*;

public class Executor {
    public static void main(String[] args) throws IOException {

        // switch, final, static
        CustomerTransportation interCity = new CustomerTransportation("Stepanovych", "Chernivtsi", "Minsk");
        System.out.println("Driver - " + interCity.getDriver());

        System.out.println();

        LuggageTrain ural = new LuggageTrain("ural", false, "platform", 50);
        System.out.println("Name - " + ural.getNameTrain());
        System.out.println("Train on order - " + ural.isOnOrder());
        ural.setFullTankOil(false);
        ural.canTrainWorks();
        ural.fullTankOil();

        System.out.println();

        Customer rudyk = new Customer("Vasyl", "Rudyk", false, 14523);
        System.out.println("Name - " + rudyk.getName());
        System.out.println("Surname - " + rudyk.getSurname());
        System.out.println("Total price - " + rudyk.sumPriceTicket(100, 1, 1) + " UAH");
        System.out.println("Total price - " + String.format("%.2f", rudyk.sumPriceTicket(500.156f, 2)) + " UAH");

        System.out.println();

        LuggageTrain vaz = new LuggageTrain("vaz", true);
        LuggageTrain kaz = new LuggageTrain("kaz", true);
        LuggageTrain maz = new LuggageTrain("maz", false);
        LuggageTrain naz = new LuggageTrain("naz", true);

        LuggageTrain [] arrayLT = {ural, vaz, kaz, maz, naz};

        for (LuggageTrain a: arrayLT) {
            switch (a.getIndexTrain()) {
                case 1:
                    System.out.println("I`m Ural!!!");
                    break;
                case 2:
                    System.out.println("I`m Vaz!!!");
                    break;
                case 3:
                    System.out.println("I`m Kaz!!!");
                    break;
                case 4:
                    System.out.println("I`m Maz!!!");
                    break;
                case 5:
                    System.out.println("I`m Naz!!!");
                    break;
            }
        }

        System.out.println();

        LuggageTrain.getCountLuggageTrain();

        System.out.println();

        /*LuggageTrain bmw = new LuggageTrain("BMW", false);
        LuggageTrain bmw2 = new LuggageTrain("BMW", true);
        LuggageTrain honda = new LuggageTrain("HONDA", false);

        Set<String> nameTrains = new HashSet<String>();
        nameTrains.add(bmw.getNameTrain());
        nameTrains.add(bmw2.getNameTrain());
        nameTrains.add(honda.getNameTrain());

        for (String str: nameTrains) {
            System.out.println(str);
        }

        bmw.setTypeCarriage("Platform");
        bmw2.setTypeCarriage("Box");

        Map<Integer, String> typeCarriage = new HashMap<Integer, String>();
        typeCarriage.put(1, bmw.getTypeCarriage());
        typeCarriage.put(2, bmw2.getTypeCarriage());

        System.out.println(typeCarriage.get(2));

        Customer customer1 = new Customer("Vasya", "Rudyk");
        Customer customer2 = new Customer("Tanya", "Rudyk");
        Customer customer3 = new Customer("Denys", "Holiney");
        Customer customer4 = new Customer("Oleh", "Chepak");
        Customer customer5 = new Customer("Vasya", "Holiney");

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);

        Customer vasya = customers.get(4);
        System.out.println(vasya);*/
    }
}
