package company.partnercompany;

import company.transportation.LuggageTransportation;

import java.util.List;

public class PartnerCompany {
    private Long id_partnerCompany;
    private String nameCompany;
    private String city;
    private List<LuggageTransportation> luggageTransportations;

    public List<LuggageTransportation> getLuggageTransportations() {
        return luggageTransportations;
    }

    public void setLuggageTransportations(List<LuggageTransportation> luggageTransportations) {
        this.luggageTransportations = luggageTransportations;
    }

    public Long getId_partnerCompany() {
        return id_partnerCompany;
    }

    public void setId_partnerCompany(Long id_partnerCompany) {
        this.id_partnerCompany = id_partnerCompany;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "PartnerCompany{" +
                "id_partnerCompany=" + id_partnerCompany +
                ", nameCompany='" + nameCompany + '\'' +
                ", city='" + city + '\'' +
                ", luggageTransportations=" + luggageTransportations +
                '}';
    }
}
