package company.partnercompany;

public class PartnerCompany {
    protected String nameCompany;
    protected String cityWhereCompany;

    public PartnerCompany(){}

    public PartnerCompany(String nameCompany, String cityWhereCompany){
        this.nameCompany = nameCompany;
        this.cityWhereCompany = cityWhereCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public void setCityWhereCompany(String cityWhereCompany) {
        this.cityWhereCompany = cityWhereCompany;
    }

    public String getNameCompany() {
        return this.nameCompany;
    }

    public String getCityWhereCompany() {
        return this.cityWhereCompany;
    }
}
