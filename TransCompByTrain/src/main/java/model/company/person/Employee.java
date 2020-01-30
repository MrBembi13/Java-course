package model.company.person;

public class Employee extends PersonModel {

    private Long id_employee;
    private String postEmployee;
    private int wagesEmployee;
    private PersonModel personModel;

    public Long getId_employee() {
        return id_employee;
    }

    public void setId_employee(Long id_employee) {
        this.id_employee = id_employee;
    }

    public String getPostEmployee() {
        return postEmployee;
    }

    public void setPostEmployee(String postEmployee) {
        this.postEmployee = postEmployee;
    }

    public int getWagesEmployee() {
        return wagesEmployee;
    }

    public void setWagesEmployee(int wagesEmployee) {
        this.wagesEmployee = wagesEmployee;
    }

    public PersonModel getPersonModel() {
        return personModel;
    }

    public void setPersonModel(PersonModel personModel) {
        this.personModel = personModel;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id_employee=" + id_employee +
                ", postEmployee='" + postEmployee + '\'' +
                ", wagesEmployee=" + wagesEmployee +
                ", person=" + personModel +
                '}';
    }
}
