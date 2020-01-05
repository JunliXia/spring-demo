package com.example.springdemo.beans;


public class Father {

    private String name;
    private Integer id;

    public Father() {
    }

    public Father(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String sayHello(){
        System.out.println("father say hello");
        return "hello";
    }

}
