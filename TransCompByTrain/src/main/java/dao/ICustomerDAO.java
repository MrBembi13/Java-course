package dao;

import model.company.person.CustomerModel;

import java.util.List;

public interface ICustomerDAO {
    CustomerModel getCustomerById(Long id);

    List<CustomerModel> getCustomerList();

    void insertCustomer (CustomerModel entity);

    void deleteCustomer (CustomerModel entity);

    void updateCustomer (CustomerModel entity);
}
