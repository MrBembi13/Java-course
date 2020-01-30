package model.company.transportation;

import model.company.person.CustomerModel;

import java.util.List;

public class CustomerTransportation extends Transportation {

    private Long id_customerTr;
    private Transportation transportation;
    private int countSeat;
    private List<CustomerModel> customerModelList;

    public Long getId_customerTr() {
        return id_customerTr;
    }

    public void setId_customerTr(Long id_customerTr) {
        this.id_customerTr = id_customerTr;
    }

    public Transportation getTransportation() {
        return transportation;
    }

    public void setTransportation(Transportation transportation) {
        this.transportation = transportation;
    }

    public int getCountSeat() {
        return countSeat;
    }

    public void setCountSeat(int countSeat) {
        this.countSeat = countSeat;
    }

    public List<CustomerModel> getCustomerModelList() {
        return customerModelList;
    }

    public void setCustomerModelList(List<CustomerModel> customerModelList) {
        this.customerModelList = customerModelList;
    }

    @Override
    public String toString() {
        return "CustomerTransportation{" +
                "id_customerTr=" + id_customerTr +
                ", transportation=" + transportation +
                ", countSeat=" + countSeat +
                ", customerList=" + getCustomerModelList() +
                '}';
    }
}
