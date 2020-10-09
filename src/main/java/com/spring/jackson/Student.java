package com.spring.jackson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Student {

    private Long id;
    private String firstName;
    private String lastName;
    private boolean active;
    private Address address;
    private String[] languages;

}
