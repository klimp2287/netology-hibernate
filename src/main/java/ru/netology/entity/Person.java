package ru.netology.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "PERSONS")
@IdClass(PersonId.class)
public class Person {
    @Id
    @Column(name = "name", length = 20)
    private String name;

    @Id
    @Column(name = "surname", length = 20)
    private String surname;

    @Id
    @Column(name = "age")
    private Integer age;

    @Column(name = "phone_number", length = 18, nullable = false ,unique = true)
    private String phoneNumber;

    @Column(name = "citi_of_living", length = 40)
    private String cityOfLiving;
}
