package dao;

import model.company.train.LuggageTrain;

import java.util.List;

public interface LuggageTrainMapper {
    LuggageTrain getLuggageTrainByID(Integer id);
    List<LuggageTrain> getLuggageTrains();
}
