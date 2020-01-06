package com.example.springdemo.serialize;

import java.io.*;

/**
 * @author: admin
 * @date: 2020/1/6 15:52
 * @description:
 */
public class SerializeTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person(12, "xasd");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
        outputStream.writeObject(person);
        outputStream.flush();
        outputStream.close();
        byte[] result = byteArrayOutputStream.toByteArray();

        ObjectInputStream inputStream = new ObjectInputStream(new ByteArrayInputStream(result));
        Person serPeron = (Person) inputStream.readObject();
        System.out.println(serPeron.toString());


    }
}
