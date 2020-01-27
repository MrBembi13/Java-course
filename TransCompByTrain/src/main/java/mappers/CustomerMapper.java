package mappers;

import company.person.Customer;
import company.person.CustomerModel;

import java.util.List;

public interface CustomerMapper {
    CustomerModel getCustomerByID(Integer id);
    List<CustomerModel> getCustomers();
}
