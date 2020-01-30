package dao;

import model.company.transportation.Transportation;

import java.util.List;

public interface TransportationMapper {
    Transportation getTransportationByID(Integer id);
    List<Transportation> getTransportations();
}
