import company.person.Customer;
import company.person.CustomerModel;
import mappers.*;
import util.OpenSession;


import java.util.List;

public class Executor {

    public static void main(String[] args) {

        CustomerMapper customerMapper;

        customerMapper = OpenSession.getOpenSession().openSession().getMapper(CustomerMapper.class);
        CustomerModel customerModel = customerMapper.getCustomerByID(1);
        System.out.println(customerModel);
    }
}