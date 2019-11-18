package company.transportation;

public class CustomerTransportation extends Transportation {
    private String typeTrain; //тип поезда(плацкарт, купе ...)
    private int countSeat; //количество посадочных мест
    private boolean carriageRestaurant = false; //есть ли вагон ресторан

    public CustomerTransportation(){}

    public CustomerTransportation(String driver, String modelTrain, String cityDeparture, String cityArrival, int countCarriage){
        super(driver, modelTrain, cityDeparture, cityArrival, countCarriage);
    }

    public CustomerTransportation(String driver, String modelTrain, String cityDeparture, String cityArrival, int countCarriage, String typeTrain, int countSeat, boolean carriageRestaurant){
        super(driver, modelTrain, cityDeparture, cityArrival, countCarriage);
        this.typeTrain = typeTrain;
        this.countSeat = countSeat;
        this.carriageRestaurant = carriageRestaurant;
    }

    public void setCustomerTransportation(String typeTrain, int countSeat, boolean carriageRestaurant){
        this.typeTrain = typeTrain;
        this.countSeat = countSeat;
        this.carriageRestaurant = carriageRestaurant;
    }

    public void gerCustomerTransportation(){
        System.out.println("Type train: " + this.typeTrain);
        System.out.println("Count seats: " + this.countSeat);
        System.out.println("Has train a carriage restaurant? " + this.carriageRestaurant);
    }
}
