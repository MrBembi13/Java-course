package model.company.train;

import model.company.transportation.CustomerTransportation;

import java.util.List;

public class CustomerTrain {

    private Long id_customerTrain;
    private String nameTrain;
    private String typeCarriage;
    private List<CustomerTransportation> customerTransportationList;

    public Long getId_customerTrain() {
        return id_customerTrain;
    }

    public void setId_customerTrain(Long id_customerTrain) {
        this.id_customerTrain = id_customerTrain;
    }

    public String getNameTrain() {
        return nameTrain;
    }

    public void setNameTrain(String nameTrain) {
        this.nameTrain = nameTrain;
    }

    public String getTypeCarriage() {
        return typeCarriage;
    }

    public void setTypeCarriage(String typeCarriage) {
        this.typeCarriage = typeCarriage;
    }

    public List<CustomerTransportation> getCustomerTransportationList() {
        return customerTransportationList;
    }

    public void setCustomerTransportationList(List<CustomerTransportation> customerTransportationList) {
        this.customerTransportationList = customerTransportationList;
    }

    @Override
    public String toString() {
        return "CustomerTrain{" +
                "id_customerTrain=" + id_customerTrain +
                ", nameTrain='" + nameTrain + '\'' +
                ", typeCarriage='" + typeCarriage + '\'' +
                ", customerTransportationList=" + customerTransportationList +
                '}';
    }
}
