package company.person;

public class Customer extends Person {

    private boolean haveAnimals = false;
    private int documentCustomer;

    public Customer() {}    

    public Customer(String nameCustomer, String surnameCustomer){
        super(nameCustomer, surnameCustomer);
    }

    public Customer(String nameCustomer, String surnameCustomer, boolean haveAnimals, int documentCustomer) {
        super(nameCustomer, surnameCustomer);
        this.haveAnimals = haveAnimals;
        this.documentCustomer = documentCustomer;
    }

    public int sumPriceTicket(int priceTicket, int howManyPerson){
        return (priceTicket*howManyPerson);
    }

    public int sumPriceTicket(int priceTicket, int howManyPerson, int howManyVeil){
        return (priceTicket*howManyPerson) + (50 * howManyVeil);
    }

    public void setHaveAnimals(boolean haveAnimals) {
        this.haveAnimals = haveAnimals;
    }

    public void setDocumentCustomer(int documentCustomer) {
        this.documentCustomer = documentCustomer;
    }

    public int getDocumentCustomer() {
        return this.documentCustomer;
    }

    public boolean isHaveAnimals() {
        return this.haveAnimals;
    }

    @Override
    public void walk(){
        System.out.println("walking");
    }

    @Override
    public void stay(){
        System.out.println("stay");
    }
}
