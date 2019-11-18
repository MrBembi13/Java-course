package company.person;

public class Employee extends Person {

    private String postEmployee;
    private int wagesEmployee;

    public Employee (){}

    public Employee(String nameEmployee, String surnameEmployee, byte ageEmployee, String sexEmployee){
        super(nameEmployee, surnameEmployee,ageEmployee, sexEmployee);
    }

    public Employee(String nameEmployee, String surnameEmployee, byte ageEmployee, String sexEmployee, String postEmployee, int wagesEmployee){
        super(nameEmployee, surnameEmployee, ageEmployee, sexEmployee);
        this.postEmployee = postEmployee;
        this.wagesEmployee = wagesEmployee;
    }

    public void setEmployee(String postEmployee, int wagesEmployee){
        this.postEmployee = postEmployee;
        this.wagesEmployee = wagesEmployee;
    }

    public void getEmployee(){
        System.out.println("Post: " + this.postEmployee);
        System.out.println("Wages: " + this.wagesEmployee);
    }
}
