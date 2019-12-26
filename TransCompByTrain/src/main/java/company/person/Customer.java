package company.person;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

    private boolean haveAnimals = false;
    private int documentCustomer;
    public final float PDV_TICKET = 1.15f;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Customer() {
    }

    public Customer(String nameCustomer, String surnameCustomer){
        super(nameCustomer, surnameCustomer);
    }

    public Customer(String nameCustomer, String surnameCustomer, boolean haveAnimals, int documentCustomer) {
        super(nameCustomer, surnameCustomer);
        this.haveAnimals = haveAnimals;
        this.documentCustomer = documentCustomer;
    }

    public void addCustomers (Customer customer){
        customers.add(customer);
    }

    public List<Customer> getCustomers (){
        return customers;
    }

    public float sumPriceTicket(float priceTicket, int howManyPerson){
        return (priceTicket*howManyPerson) * PDV_TICKET;
    }

    public float sumPriceTicket(float priceTicket, int howManyPerson, int howManyVeil){
        return ((priceTicket*howManyPerson) + (50 * howManyVeil)) * PDV_TICKET;
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

    @Override
    public String toString() {
        return "Customer - " + name + " " + surname;
    }
}
