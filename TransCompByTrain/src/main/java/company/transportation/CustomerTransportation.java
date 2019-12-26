package company.transportation;

public class CustomerTransportation extends Transportation {
    private String typeTrain;
    private int countSeat;

    public CustomerTransportation(){}

    public CustomerTransportation(String driver, String cityDeparture, String cityArrival){
        super(driver, cityDeparture, cityArrival);
    }

    public CustomerTransportation(String driver, String cityDeparture, String cityArrival, String typeTrain, int countSeat){
        super(driver, cityDeparture, cityArrival);
        this.typeTrain = typeTrain;
        this.countSeat = countSeat;
    }

    public void setTypeTrain(String typeTrain) {
        this.typeTrain = typeTrain;
    }

    public void setCountSeat(int countSeat) {
        this.countSeat = countSeat;
    }

    public String getTypeTrain() {
        return this.typeTrain;
    }

    public int getCountSeat() {
        return this.countSeat;
    }
}
