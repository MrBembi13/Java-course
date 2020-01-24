package company.transportation;

public class LuggageTransportation extends Transportation{
    private Long id_luggageTr;
    private Transportation transportation;
    private String typeLuggage;

    public Long getId_luggageTr() {
        return id_luggageTr;
    }

    public void setId_luggageTr(Long id_luggageTr) {
        this.id_luggageTr = id_luggageTr;
    }

    public Transportation getTransportation() {
        return transportation;
    }

    public void setTransportation(Transportation transportation) {
        this.transportation = transportation;
    }

    public String getTypeLuggage() {
        return typeLuggage;
    }

    public void setTypeLuggage(String typeLuggage) {
        this.typeLuggage = typeLuggage;
    }

    @Override
    public String toString() {
        return "LuggageTransportation{" +
                "id_luggageTr=" + id_luggageTr +
                ", transportation=" + transportation +
                ", typeLuggage='" + typeLuggage + '\'' +
                '}';
    }
}
