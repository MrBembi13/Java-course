package model.company.transportation;

import model.company.person.Employee;

public class Transportation {

    private Long id_transportation;
    private Employee driver;
    private String cityDeparture;
    private String cityArrival;

    public Long getId_transportation() {
        return id_transportation;
    }

    public void setId_transportation(Long id_transportation) {
        this.id_transportation = id_transportation;
    }

    public Employee getDriver() {
        return driver;
    }

    public void setDriver(Employee driver) {
        this.driver = driver;
    }

    public String getCityDeparture() {
        return cityDeparture;
    }

    public void setCityDeparture(String cityDeparture) {
        this.cityDeparture = cityDeparture;
    }

    public String getCityArrival() {
        return cityArrival;
    }

    public void setCityArrival(String cityArrival) {
        this.cityArrival = cityArrival;
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "id_transportation=" + id_transportation +
                ", driver=" + driver +
                ", cityDeparture='" + cityDeparture + '\'' +
                ", cityArrival='" + cityArrival + '\'' +
                '}';
    }
}
