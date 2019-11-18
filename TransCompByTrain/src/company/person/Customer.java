package company.person;

public class Customer extends Person {

    private boolean haveAnimals = false;
    private int documentCustomer;
    private int numberTicket;

    public Customer() {}

    public Customer(String nameCustomer, String surnameCustomer, byte ageCustomer, String sexCustomer){
        super(nameCustomer, surnameCustomer, ageCustomer, sexCustomer);
    }

    public Customer(String nameCustomer, String surnameCustomer, byte ageCustomer, String sexCustomer, boolean haveAnimals, int documentCustomer, int numberTicket) {
        super(nameCustomer, surnameCustomer, ageCustomer, sexCustomer);
        this.haveAnimals = haveAnimals;
        this.documentCustomer = documentCustomer;
        this.numberTicket = numberTicket;
    }

    public void setCustomer(boolean haveAnimals, int documentCustomer, int numberTicket) {
        this.haveAnimals = haveAnimals;
        this.documentCustomer = documentCustomer;
        this.numberTicket = numberTicket;
    }

    public void getCustomer(){
        System.out.println("Have you some animals?  " + this.haveAnimals);
        System.out.println("Number document: " + this.documentCustomer);
        System.out.println("Number ticket: " + this.numberTicket);
    }
}
