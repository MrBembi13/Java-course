package main;

import company.person.Customer;
import util.iokeyboard.InputKeyboard;

public class Executor {
    public static void main(String[] args) {


        Customer customer1 = new Customer();
        InputKeyboard inputKeyboard = new InputKeyboard();

        System.out.println("Enter your Name:");
        customer1.setName(inputKeyboard.inputString());
        System.out.println("Name - " + customer1.getName());


        System.out.println("Enter your Surname:");
        customer1.setSurname(inputKeyboard.inputString());
        System.out.println("Surname - " + customer1.getSurname());
    }
}
