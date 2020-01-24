package mappers;

import company.person.Customer;

import java.util.List;

public interface CustomerMapper {
    Customer getCustomerByID(Integer id);
    List<Customer> getCustomers();
}
