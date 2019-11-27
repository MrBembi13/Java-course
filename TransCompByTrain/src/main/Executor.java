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

        CustomerTrain peugeot = new CustomerTrain("peugeot", false);
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

        ural.getCountLuggageTrain();

        System.out.println();

        // polymorph
        /*TrainPark bmw = new CustomerTrain();
        TrainPark mercedes = new CustomerTrain();
        TrainPark honda = new LuggageTrain();

        TrainPark [] array = {bmw, mercedes, honda};
        for (TrainPark t: array) {
            t.typeTrain();
        }*/


    }
}
