package com.example.springdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Y {


    @Autowired
    X  x;

    public Y(){
        log.info("Y info");
        System.out.println("Y created");
    }

}
