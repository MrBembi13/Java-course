package mappers;

import company.transportation.LuggageTransportation;

import java.util.List;

public interface LuggageTransportationMapper {
    List<LuggageTransportation> getLuggageTransportationByIDLT(Integer id);
    List<LuggageTransportation> getLuggageTransportationByIDPC(Integer id);
    LuggageTransportation getLuggageTransportationByID(Integer id);
}
