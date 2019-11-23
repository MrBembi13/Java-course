package main;

import company.partnercompany.PartnerCompany;
import company.person.Customer;
import company.person.Employee;
import company.train.CustomerTrain;
import company.train.LuggageTrain;
import company.transportation.CustomerTransportation;
import company.transportation.LuggageTransportation;

public class Executor {
    public static void main(String[] args) {

        CustomerTransportation interCity = new CustomerTransportation("Stepanovych", "Chernivtsi", "Minsk");
        System.out.println("Driver - " + interCity.getDriver());
        interCity.setDriver("Kuzya");
        System.out.println("Driver - " + interCity.getDriver());
    }
}
