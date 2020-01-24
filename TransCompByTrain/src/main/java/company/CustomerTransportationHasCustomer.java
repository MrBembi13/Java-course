package company;

public class CustomerTransportationHasCustomer {
    private Long customerTransportation_id_customerTr;
    private Long customerTransportation_id_customerTrain;
    private Long customerTransportation_id_transportation;
    private Long customer_id_customer;
    private Long customer_id_person;

    public Long getCustomerTransportation_id_customerTr() {
        return customerTransportation_id_customerTr;
    }

    public void setCustomerTransportation_id_customerTr(Long customerTransportation_id_customerTr) {
        this.customerTransportation_id_customerTr = customerTransportation_id_customerTr;
    }

    public Long getCustomerTransportation_id_customerTrain() {
        return customerTransportation_id_customerTrain;
    }

    public void setCustomerTransportation_id_customerTrain(Long customerTransportation_id_customerTrain) {
        this.customerTransportation_id_customerTrain = customerTransportation_id_customerTrain;
    }

    public Long getCustomerTransportation_id_transportation() {
        return customerTransportation_id_transportation;
    }

    public void setCustomerTransportation_id_transportation(Long customerTransportation_id_transportation) {
        this.customerTransportation_id_transportation = customerTransportation_id_transportation;
    }

    public Long getCustomer_id_customer() {
        return customer_id_customer;
    }

    public void setCustomer_id_customer(Long customer_id_customer) {
        this.customer_id_customer = customer_id_customer;
    }

    public Long getCustomer_id_person() {
        return customer_id_person;
    }

    public void setCustomer_id_person(Long customer_id_person) {
        this.customer_id_person = customer_id_person;
    }

    @Override
    public String toString() {
        return "CustomerTransportationHasCustomer{" +
                "customerTransportation_id_customerTr=" + customerTransportation_id_customerTr +
                ", customerTransportation_id_customerTrain=" + customerTransportation_id_customerTrain +
                ", customerTransportation_id_transportation=" + customerTransportation_id_transportation +
                ", customer_id_customer=" + customer_id_customer +
                ", customer_id_person=" + customer_id_person +
                '}';
    }
}
