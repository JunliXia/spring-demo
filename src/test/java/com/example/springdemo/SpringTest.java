package com.example.springdemo;

import com.example.springdemo.service.X;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
public class SpringTest {

    @Autowired
    X x;



    @Test
    public void testO(){
        System.out.println("hello world");
        System.out.println(x);
        List<String> as = new ArrayList<>();
//        as.stream().
    }

}
