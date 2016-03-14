package com.extjstraining.server.daos;

import com.extjstraining.server.models.Person;

import java.util.List;

/**
 * Created by sletras on 11/03/2016.
 */
public interface PersonDao {
    Person saveOrUpdate(Person person);

    Person get(String name);

    List<Person> get();

    Person delete(Person person);
}
