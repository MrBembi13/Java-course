package util.jackson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import model.company.person.CustomerModel;
import model.company.person.PersonModel;

import java.io.*;
import java.util.Collection;

public class PojoToJson<T> {

    private ObjectMapper objectMapper = new ObjectMapper();

    public void toJson(T entity, String file) throws IOException {
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        objectMapper.writeValue(fileOutputStream, entity);
        fileOutputStream.close();
    }

    public void toJson(Collection<T> entities, String file) throws IOException {
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        objectMapper.writeValue(fileOutputStream, entities);
        fileOutputStream.close();
    }

    public PersonModel fromJson(String file) throws IOException {
        InputStream fileInputStream = new FileInputStream(file);
        PersonModel customerModel = objectMapper.readValue(fileInputStream, new TypeReference<PersonModel>() {});
        return customerModel;
    }
}
