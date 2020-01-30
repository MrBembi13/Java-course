package dao;

import model.company.partnercompany.PartnerCompany;

import java.util.List;

public interface PartnerCompanyMapper {
    PartnerCompany getPartnerCompanyByID (Integer id);

    List<PartnerCompany> getPartnerCompany();

}
