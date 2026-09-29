package ru.netology.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class PersonId implements Serializable {
    private String name;
    private String surname;
    private Integer age;
}
