import company.partnercompany.PartnerCompany;
import company.person.Customer;
import mappers.PartnerCompanyMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Executor {

    public static void main(String[] args) {

        SqlSessionFactory sqlSessionFactory;
        PartnerCompanyMapper partnerCompanyMapper;
        Reader reader = null;

        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            partnerCompanyMapper = sqlSessionFactory.openSession().getMapper(PartnerCompanyMapper.class);
            List partnerCompanies = partnerCompanyMapper.getPartnerCompany();
            PartnerCompany partnerCompany = partnerCompanyMapper.getPartnerCompanyByID(1);
            System.out.println(partnerCompany);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}