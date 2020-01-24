import company.partnercompany.PartnerCompany;
import company.person.Customer;
import company.person.Person;
import company.train.CustomerTrain;
import company.train.LuggageTrain;
import company.transportation.LuggageTransportation;
import company.transportation.Transportation;
import mappers.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Executor {

    public static void main(String[] args) {

        SqlSessionFactory sqlSessionFactory;
        LuggageTransportationMapper customerMapper;
        Reader reader = null;

        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            customerMapper = sqlSessionFactory.openSession().getMapper(LuggageTransportationMapper.class);
            List persons = customerMapper.getLuggageTransportationByIDLT(1);
            LuggageTransportation person = customerMapper.getLuggageTransportationByID(1);
            System.out.println(person);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}