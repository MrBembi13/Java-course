package main;

import company.person.Customer;
import company.train.CustomerTrain;
import company.train.LuggageTrain;
import company.train.TrainInfo;
import company.train.TrainPark;
import company.transportation.CustomerTransportation;

public class Executor {
    public static void main(String[] args) {

        CustomerTransportation interCity = new CustomerTransportation("Stepanovych", "Chernivtsi", "Minsk");
        System.out.println("Driver - " + interCity.getDriver());

        System.out.println();

        LuggageTrain ural = new LuggageTrain(24, "ural", false, "platform", 50);
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

        CustomerTrain peugeot = new CustomerTrain(12, "peugeot", false);
        LuggageTrain vaz = new LuggageTrain(13, "vaz", true);


        TrainPark bmw = new CustomerTrain();
        TrainPark mercedes = new CustomerTrain();
        TrainPark honda = new LuggageTrain();

        TrainPark [] array = {bmw, mercedes, honda};
        for (TrainPark t: array) {
            t.typeTrain();
        }

        System.out.println();

        ural.getCountLuggageTrain();

        System.out.println();



    }
}
