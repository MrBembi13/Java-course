package company.person;

public class Person {
    protected String name;
    protected String surname;
    protected byte age;
    protected String sex;

    public Person(){}

    public Person(String name, String surname, byte age, String sex){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    public void setPerson(String namePerson, String surnamePerson, byte agePerson, String sexPerson){
        this.name = namePerson;
        this.surname =surnamePerson;
        this.age = agePerson;
        this.sex = sexPerson;
    }

    public void getPerson(){
        System.out.println("Name: " + this.name);
        System.out.println("Surnmae: " + this.surname);
        System.out.println("Sex: " + this.sex);
        System.out.println("Age: " + this.age);
    }
}
