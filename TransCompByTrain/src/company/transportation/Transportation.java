package company.transportation;

public class Transportation {
    protected String driver; //водитель
    protected String modelTrain; //модель поезда
    protected String cityDeparture; //город отбытия
    protected String cityArrival; //город прибытие
    protected int countCarriage; //количество вагонов

    public Transportation(){}

    public Transportation(String driver, String modelTrain, String cityDeparture, String cityArrival, int countCarriage){
        this.driver = driver;
        this.modelTrain = modelTrain;
        this.cityDeparture = cityDeparture;
        this.cityArrival = cityArrival;
        this.countCarriage = countCarriage;
    }

    public void setTransportation(String driver, String modelTrain, String cityDeparture, String cityArrival, int countCarriage){
        this.modelTrain = modelTrain;
        this.driver = driver;
        this.cityDeparture = cityDeparture;
        this.cityArrival = cityArrival;
        this.countCarriage = countCarriage;
    }

    public void getTransportation(){
        System.out.println("Driver: " + this.driver);
        System.out.println("Model Train: " + this.modelTrain);
        System.out.println("City of departure: " + this.cityDeparture);
        System.out.println("City of arrival: " + this.cityArrival);
        System.out.println("Count carriage: " + this.countCarriage);
    }
}
