package company.partnercompany;

public class PartnerCompany {
    protected String nameCompany;
    protected String cityWhereCompany;
    protected String typeCooperation;
    protected int sinceWorkTogether;

    public PartnerCompany(){}

    public PartnerCompany(String nameCompany, String cityWhereCompany, String typeCooperation, int sinceWorkTogether){
        this.nameCompany = nameCompany;
        this.cityWhereCompany = cityWhereCompany;
        this.typeCooperation = typeCooperation;
        this.sinceWorkTogether = sinceWorkTogether;
    }

    public void setPartnerCompany(String nameCompany, String cityWhereCompany, String typeCooperation, int sinceWorkTogether){
        this.nameCompany = nameCompany;
        this.cityWhereCompany = cityWhereCompany;
        this.typeCooperation = typeCooperation;
        this.sinceWorkTogether = sinceWorkTogether;
    }

    public void getPartnerCompany(){
        System.out.println("Name Company: " + this.nameCompany);
        System.out.println("City of Company: " + this.cityWhereCompany);
        System.out.println("Type cooperation: " + this.typeCooperation);
        System.out.println("Work together since: " + this.sinceWorkTogether);
    }
}
