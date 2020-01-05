package com.example.springdemo.beans;

public class Son extends Father {
    private String school;


    public Son(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String sayHello() {
        String asd = "sd";
        String one = super.sayHello();
        System.out.println("son wang wang wang");
        return "asd";

    }
}
