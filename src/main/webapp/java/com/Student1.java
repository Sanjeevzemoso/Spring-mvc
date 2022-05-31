package com;

public class Student1 {

    private String firstName;
    private String lastName;
    private String city;



    public Student1(){

    }

    public String getFirstName() {
        System.out.println("hi1");
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("hi1");
        this.firstName = firstName;
    }

    public String getLastName() {
        System.out.println("hi2");
        return lastName;
    }

    public void setLastName(String lastName) {
        System.out.println("hi2");
        this.lastName = lastName;
    }

    public String getCity() {
        System.out.println("hi3");
        return city;
    }

    public void setCity(String city) {
        System.out.println("hi3");
        this.city = city;
    }
}
