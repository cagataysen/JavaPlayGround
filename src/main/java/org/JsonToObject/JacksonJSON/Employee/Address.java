package org.JsonToObject.JacksonJSON.Employee;

public class Address {

    private String street;
    private String city;
    private Integer zipcode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return " street:'" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipcode=" + zipcode;
    }



}
