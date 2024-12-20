package org.JsonToObject.JacksonJSON.Employee;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EmployeeJacksonObjectMapper {
    public static void main(String[] args) throws IOException {


            //read json file data to String  --- use absolute path for files (guarantee solution)
            byte[] jsonData = Files.readAllBytes(Paths.get("C:\\Users\\Komp\\Desktop\\Projects\\JavaPlayGround\\src\\main\\java\\org\\JsonToObject\\JacksonJSON\\Employee\\json.txt"));

            //create ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            //convert json string to object
            Employee emp = objectMapper.readValue(jsonData, Employee.class);

            System.out.println("Employee Object\n"+emp);




    }
}
