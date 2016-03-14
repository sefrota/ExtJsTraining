package com.extjstraining.server.services.impl;

import com.extjstraining.server.daos.impl.PersonDaoImpl;
import com.extjstraining.server.models.Person;
import com.extjstraining.server.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sletras on 09/03/2016.
 */
@Service
public class PersonServiceImpl implements PersonService {

    private PersonDaoImpl personDao;

    @Autowired
    public PersonServiceImpl(PersonDaoImpl personDao) {
        this.personDao = personDao;
    }

    @Override
    public List<Person> getPeople() {
        return personDao.get();
    }

}
