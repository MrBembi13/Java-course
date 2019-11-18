package company.transportation;

public class LuggageTransportation extends Transportation{
    private String partnerCompany; //компании партёры
    private String typeLuggage; //тип груза перевозки

    public LuggageTransportation(){}

    public LuggageTransportation(String driver, String modelTrain, String cityDeparture, String cityArrival, int countCarriage){
        super(driver, modelTrain, cityDeparture, cityArrival, countCarriage);
    }

    public LuggageTransportation(String driver, String modelTrain, String cityDeparture, String cityArrival, int countCarriage, String partnerCompany, String typeLuggage){
        super(driver, modelTrain, cityDeparture, cityArrival, countCarriage);
        this.partnerCompany = partnerCompany;
        this.typeLuggage = typeLuggage;
    }

    public void setLuggageTransportation(String partnerCompany, String typeLuggage){
        this.partnerCompany = partnerCompany;
        this.typeLuggage = typeLuggage;
    }

    public void getLuggageTransportation(){
        System.out.println("Partner company: " + this.partnerCompany);
        System.out.println("Type luggage: " + this.typeLuggage);
    }
}
