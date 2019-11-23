package company.person;

public abstract class Person {
    protected String name;
    protected String surname;

    public abstract void walk();

    public abstract void stay();

    public Person(){}

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void setName(String namePerson){
        this.name = namePerson;
    }

    public void setSurname(String surnamePerson){
        this.name = surnamePerson;
    }

    public void getName(){
        System.out.println("Name: " + this.name);
    }

    public void getSurname(){
        System.out.println("Surname: " + this.surname);
    }
}
