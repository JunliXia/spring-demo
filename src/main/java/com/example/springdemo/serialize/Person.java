package com.example.springdemo.serialize;

import java.io.Serializable;

/**
 * @author: admin
 * @date: 2020/1/6 15:52
 * @description:
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 5239617597895535039L;

    private Integer age;
    private String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
