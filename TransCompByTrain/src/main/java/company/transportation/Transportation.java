package company.transportation;

public abstract class Transportation {
    protected String driver;
    protected String cityDeparture;
    protected String cityArrival;

    public Transportation(){}

    public Transportation(String driver, String cityDeparture, String cityArrival){
        this.driver = driver;
        this.cityDeparture = cityDeparture;
        this.cityArrival = cityArrival;
    }

    public void setDriver(String driver){
        this.driver = driver;
    }

    public void setCityDeparture(String cityDeparture) {
        this.cityDeparture = cityDeparture;
    }

    public void setCityArrival(String cityArrival) {
        this.cityArrival = cityArrival;
    }

    public String getDriver() {
        return this.driver;
    }

    public String getCityDeparture() {
        return this.cityDeparture;
    }

    public String getCityArrival() {
        return this.cityArrival;
    }
}
