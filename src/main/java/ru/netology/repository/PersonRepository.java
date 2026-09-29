package ru.netology.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ru.netology.entity.Person;

import java.util.List;

public class PersonRepositoryImpl implements PersonRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery(
                "SELECT p FROM Person p WHERE p.cityOfLiving = :city", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}
