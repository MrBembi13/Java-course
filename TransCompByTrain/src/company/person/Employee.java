package company.person;

public class Employee extends Person {

    private String postEmployee;
    private int wagesEmployee;

    public Employee (){}

    public Employee(String nameEmployee, String surnameEmployee){
        super(nameEmployee, surnameEmployee);
    }

    public Employee(String nameEmployee, String surnameEmployee, String postEmployee, int wagesEmployee){
        super(nameEmployee, surnameEmployee);
        this.postEmployee = postEmployee;
        this.wagesEmployee = wagesEmployee;
    }

    public void setPostEmployee(String postEmployee) {
        this.postEmployee = postEmployee;
    }

    public void setWagesEmployee(int wagesEmployee) {
        this.wagesEmployee = wagesEmployee;
    }

    public String getPostEmployee() {
        return this.postEmployee;
    }

    public int getWagesEmployee() {
        return this.wagesEmployee;
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
