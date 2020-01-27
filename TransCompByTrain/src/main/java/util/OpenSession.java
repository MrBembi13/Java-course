package util;

import company.person.Customer;
import mappers.CustomerMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class OpenSession {

    public static SqlSessionFactory getOpenSession() {
        SqlSessionFactory sqlSessionFactory = null;
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e){
            e.printStackTrace();
        }

        return sqlSessionFactory;
    }
}
