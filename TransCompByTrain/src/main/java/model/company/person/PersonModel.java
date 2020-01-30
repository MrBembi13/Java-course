package model.company.person;

public class PersonModel {
    private Long id_person;
    private String name;
    private String surname;

    public void setId_person(Long idPerson){
        this.id_person = idPerson;
    }

    public Long getId_person(){
        return this.id_person;
    }

    public void setName(String namePerson){
        this.name = namePerson;
    }

    public String getName(){
        return this.name;
    }

    public void setSurname(String surnamePerson){
        this.surname = surnamePerson;
    }

    public String getSurname(){
        return this.surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id_person=" + id_person +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
