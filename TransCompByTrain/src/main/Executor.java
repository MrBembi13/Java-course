package main;

import company.person.Customer;
import iokeyboard.InputKeyboard;

public class Executor {
    public static void main(String[] args) {


        Customer vasyl = new Customer();
        InputKeyboard inputKeyboard = new InputKeyboard();

        System.out.println("Enter your Name:");
        vasyl.setName(inputKeyboard.inputString());
        System.out.println("Name - " + vasyl.getName());


        //System.out.println("Enter your Surname:");
        //vasyl.setSurname(inputKeyboard.inputString());
        //System.out.println("Surname - " + vasya.getSurname());
    }
}
