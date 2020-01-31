package dao;

import model.company.person.Employee;

import java.util.List;

public interface EmployeeMapper {
    Employee getEmployeeByID(Integer id);
    List<Employee> getEmployees();
}
