package com.spring.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Driver {

    public static void main(String[] args) {

        try {

            // create object mapper
            ObjectMapper objectMapper = new ObjectMapper();

            // read JSON file and map/convert to Java POJO: data/sample-lite.json
            Student student = objectMapper.readValue(new File("src/main/resources/data/sample-full.json"), Student.class);

            // print first name and last name
            System.out.println("student.getFirstName() = " + student.getFirstName());

            // print out address: city
            System.out.println("student.getAddress().getCity() = " + student.getAddress().getCity());

            // print out languages
            for (String language : student.getLanguages()) {
                System.out.println("language = " + language);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
