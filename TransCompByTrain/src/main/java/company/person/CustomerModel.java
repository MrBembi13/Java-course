package company.person;

public class CustomerModel extends Person {

    private Long id_customer;
    private String haveAnimal;
    private int documentCustomer;
    private Long id_personCustomer;

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

    public Long getId_personCustomer() {
        return id_personCustomer;
    }

    public void setId_personCustomer(Long id_personCustomer) {
        this.id_personCustomer = id_personCustomer;
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "id_customer=" + id_customer +
                ", haveAnimal='" + haveAnimal + '\'' +
                ", documentCustomer=" + documentCustomer +
                ", id_personCustomer=" + id_personCustomer +
                '}';
    }
}
