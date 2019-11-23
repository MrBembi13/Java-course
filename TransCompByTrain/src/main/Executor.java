package main;

import company.partnercompany.PartnerCompany;
import company.person.Customer;
import company.person.Employee;
import company.person.Person;
import company.train.CustomerTrain;
import company.train.LuggageTrain;
import company.transportation.CustomerTransportation;
import company.transportation.LuggageTransportation;

public class Executor {
    public static void main(String[] args) {

        Customer rudyk = new Customer("Vasyl", "Rudyk", (byte) 22, "male", false, 645644, 4654645);
        rudyk.getPerson();
        rudyk.getCustomer();

        System.out.println();

        Employee gerrard = new Employee("Steve", "Gerrard", (byte) 38, "male");
        gerrard.setEmployee("Coach", 50_000);
        gerrard.getPerson();
        gerrard.getEmployee();

        System.out.println();

        CustomerTransportation cherminsk = new CustomerTransportation("Popkin", "dg453", "Chernivtsi", "Minsk", 15);
        cherminsk.setCustomerTransportation("Luxe Kupe", 150, true);
        cherminsk.getTransportation();
        cherminsk.gerCustomerTransportation();

        System.out.println();

        LuggageTransportation cars = new LuggageTransportation("Ivanov", "as5457", "Chernivtsi", "Tenopil", 10);
        cars.setLuggageTransportation("BMW", "cars");
        cars.getTransportation();
        cars.getLuggageTransportation();

        System.out.println();

        CustomerTrain honda = new CustomerTrain(12, "Honda", 1990, true);
        honda.setCustomerTrain("12m", "Express");
        honda.getTrainPark();
        honda.getCustomerTrain();

        System.out.println();

        LuggageTrain zil = new LuggageTrain(15,"ZIL", 1980, false, "k130", "trailer", 15);
        zil.getTrainPark();
        zil.getLuggageTrain();

        System.out.println();

        PartnerCompany roshen = new PartnerCompany("ROSHEN", "Vinitsya", "Luggage transportation", 2014);
        roshen.getPartnerCompany();

        int a = 6, b = 7;
        a*=b;
        System.out.println(a);
    }
}
