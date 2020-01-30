package model.company.person;

public class CustomerModel {

    private Long id_customer;
    private Long id_person;
    private String haveAnimal;
    private int documentCustomer;
    private Long id_customerTr;

    public Long getId_customer() {
        return id_customer;
    }

    public void setId_customer(Long id_customer) {
        this.id_customer = id_customer;
    }

    public String getHaveAnimal() {
        return haveAnimal;
    }

    public void setHaveAnimal(String haveAnimal) {
        this.haveAnimal = haveAnimal;
    }

    public int getDocumentCustomer() {
        return documentCustomer;
    }

    public void setDocumentCustomer(int documentCustomer) {
        this.documentCustomer = documentCustomer;
    }

    public Long getId_person() {
        return id_person;
    }

    public void setId_person(Long id_person) {
        this.id_person = id_person;
    }

    public Long getId_customerTr() {
        return id_customerTr;
    }

    public void setId_customerTr(Long id_customerTr) {
        this.id_customerTr = id_customerTr;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id_customer=" + id_customer +
                ", id_person=" + id_person +
                ", haveAnimal='" + haveAnimal + '\'' +
                ", documentCustomer=" + documentCustomer +
                ", id_customerTr=" + id_customerTr +
                '}';
    }
}
