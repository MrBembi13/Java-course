package util.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DoProperties {

    public static void showProperties (String propFile){

        FileInputStream fis;
        Properties properties = new Properties();
        try {
            fis = new FileInputStream(propFile);
            properties.load(fis);
        }catch (IOException e){
            System.err.println("error");
        }

        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("surname"));
    }
}
