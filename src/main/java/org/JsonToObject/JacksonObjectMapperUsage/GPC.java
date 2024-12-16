package org.JsonToObject.JacksonObjectMapperUsage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GPC{

    public static void main(String[] args) {

        String json = "[\n" +
                "  {\n" +
                "    \"name\": \"John\",\n" +
                "    \"city\": \"Berlin\",\n" +
                "    \"cars\": [\"audi\", \"bmw\"],\n" +
                "    \"job\": \"Teacher\",\n" +
                "    \"age\": 24\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Mark\",\n" +
                "    \"city\": \"Oslo\",\n" +
                "    \"cars\": [\"VW\", \"Toyota\"],\n" +
                "    \"job\": \"Doctor\",\n" +
                "    \"age\": 29,\n" +
                "    \"color\": \"orange\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Susan\",\n" +
                "    \"city\": \"Moscow\",\n" +
                "    \"cars\": [\"Fiat\"],\n" +
                "    \"job\": \"President\",\n" +
                "    \"color\": \"yellow\"\n" +
                "  }\n" +
                "]";


        //READ FROM JSON
        ObjectMapper mapper = new ObjectMapper();
        try{
            List<GPCModel> gpcList = mapper.readValue(json,  new TypeReference<List<GPCModel>>() {});
            List<String> cities = new ArrayList<>();

            for (GPCModel model : gpcList) {
                cities.add(model.getCity());
            }

            System.out.println("Cities: " + cities);

        }
        catch (Exception e){
            e.printStackTrace();
        }

        //WRITE TO JSON FILE
        try{
            GPCModel gpcToWrite = new GPCModel("Cagatay", "Antakya", List.of("Audi", "Jeep"), "Engineer", "blue");
            mapper.writeValue(new File("target/gpcList.json"), gpcToWrite);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}

class GPCModel {

    @JsonProperty("name")
    private String name;
    @JsonProperty("city")
    private String city;
    @JsonProperty("cars")
    private List<String> cars;
    @JsonProperty("job")
    private String job;
    @JsonProperty("age")
    private String age;
    @JsonProperty("color")
    private String color;

    public GPCModel(String name, String city, List<String> cars, String job, String color) {
        this.name = name;
        this.city = city;
        this.cars = cars;
        this.job = job;
        this.color = color;
    }

    public GPCModel(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getCars() { // Updated getter for List<String>
        return cars;
    }

    public void setCars(List<String> cars) { // Updated setter for List<String>
        this.cars = cars;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


