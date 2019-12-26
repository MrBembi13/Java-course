package company.transportation;

public class LuggageTransportation extends Transportation{
    private String partnerCompany;
    private String typeLuggage;

    public LuggageTransportation(){}

    public LuggageTransportation(String driver, String cityDeparture, String cityArrival){
        super(driver, cityDeparture, cityArrival);
    }

    public LuggageTransportation(String driver, String cityDeparture, String cityArrival, String partnerCompany, String typeLuggage){
        super(driver, cityDeparture, cityArrival);
        this.partnerCompany = partnerCompany;
        this.typeLuggage = typeLuggage;
    }

    public void setPartnerCompany(String partnerCompany) {
        this.partnerCompany = partnerCompany;
    }

    public void setTypeLuggage(String typeLuggage) {
        this.typeLuggage = typeLuggage;
    }

    public String getPartnerCompany() {
        return this.partnerCompany;
    }

    public String getTypeLuggage() {
        return this.typeLuggage;
    }
}
