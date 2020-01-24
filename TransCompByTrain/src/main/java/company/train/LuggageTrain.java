package company.train;

import company.transportation.LuggageTransportation;

import java.util.List;

public class LuggageTrain {

    private Long id_luggageTrain;
    private String nameTrain;
    private String typeCarriage;
    private int maxWeight;
    List<LuggageTransportation> luggageTransportations;

    public List<LuggageTransportation> getLuggageTransportations() {
        return luggageTransportations;
    }

    public void setLuggageTransportations(List<LuggageTransportation> luggageTransportations) {
        this.luggageTransportations = luggageTransportations;
    }

    public Long getId_luggageTrain() {
        return id_luggageTrain;
    }

    public void setId_luggageTrain(Long id_luggageTrain) {
        this.id_luggageTrain = id_luggageTrain;
    }

    public String getNameTrain() {
        return nameTrain;
    }

    public void setNameTrain(String nameTrain) {
        this.nameTrain = nameTrain;
    }

    public String getTypeCarriage() {
        return typeCarriage;
    }

    public void setTypeCarriage(String typeCarriage) {
        this.typeCarriage = typeCarriage;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "LuggageTrain{" +
                "id_luggageTrain=" + id_luggageTrain +
                ", nameTrain='" + nameTrain + '\'' +
                ", typeCarriage='" + typeCarriage + '\'' +
                ", maxWeight=" + maxWeight +
                ", luggageTransportations=" + luggageTransportations +
                '}';
    }
}
