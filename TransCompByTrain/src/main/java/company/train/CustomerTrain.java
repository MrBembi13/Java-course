package company.train;

import company.transportation.CustomerTransportation;

import java.util.List;

public class CustomerTrain {

    private Long id_customerTrain;
    private String nameTrain;
    private String typeCarriage;
    private List<CustomerTransportation> customerTransportations;

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

    public List<CustomerTransportation> getCustomerTransportations() {
        return customerTransportations;
    }

    public void setCustomerTransportations(List<CustomerTransportation> customerTransportations) {
        this.customerTransportations = customerTransportations;
    }

    @Override
    public String toString() {
        return "CustomerTrain{" +
                "id_customerTrain=" + id_customerTrain +
                ", nameTrain='" + nameTrain + '\'' +
                ", typeCarriage='" + typeCarriage + '\'' +
                ", customerTransportations=" + customerTransportations +
                '}';
    }
}
