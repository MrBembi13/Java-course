package main;

import company.person.Customer;
import company.train.LuggageTrain;

import java.io.*;

public class Executor {
    public static void main(String[] args) throws IOException {

        LuggageTrain bmw = new LuggageTrain("BMW", false);
        LuggageTrain bmw2 = new LuggageTrain("BMW", true);
        LuggageTrain honda = new LuggageTrain("HONDA", false);

        bmw.addNameTrains(bmw.getNameTrain());
        bmw2.addNameTrains(bmw2.getNameTrain());
        honda.addNameTrains(honda.getNameTrain());

        System.out.println(LuggageTrain.getNameTrains());


        bmw.setTypeCarriage("Platform");
        bmw2.setTypeCarriage("Box");

        bmw.addTypeCarriages(bmw.getIndexTrain(),bmw.getTypeCarriage());
        bmw2.addTypeCarriages(bmw2.getIndexTrain(),bmw2.getTypeCarriage());

        System.out.println(bmw.getTypeCarriages());


        Customer customer1 = new Customer("Vasya", "Rudyk");
        Customer customer2 = new Customer("Tanya", "Rudyk");
        Customer customer3 = new Customer("Denys", "Holiney");
        Customer customer4 = new Customer("Oleh", "Chepak");
        Customer customer5 = new Customer("Vasya", "Holiney");

        customer1.addCustomers(customer1);
        customer2.addCustomers(customer2);
        customer3.addCustomers(customer3);
        customer4.addCustomers(customer4);
        customer5.addCustomers(customer5);

        System.out.println(customer1.getCustomers());
    }
}
