package dao;

import model.company.train.CustomerTrain;

import java.util.List;

public interface CustomerTrainMapper {
    CustomerTrain getCustomerTrainByID(Integer id);
    List<CustomerTrain> getCustomerTrains();
}
