package dao;

import model.company.transportation.CustomerTransportation;

import java.util.List;

public interface CustomerTransportationMapper {
    List<CustomerTransportation> getCustomerTransportationByIDCT(Integer id);
    CustomerTransportation getCustomerTransportationByID(Integer id);
}
