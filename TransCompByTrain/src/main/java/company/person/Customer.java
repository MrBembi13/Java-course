package company.person;

public class Customer extends Person {

    private Long id_customer;
    private String haveAnimal;
    private int documentCustomer;
    private Person person;

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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id_customer=" + id_customer +
                ", haveAnimal=" + haveAnimal +
                ", documentCustomer=" + documentCustomer +
                ", person=" + person +
                '}';
    }
}
