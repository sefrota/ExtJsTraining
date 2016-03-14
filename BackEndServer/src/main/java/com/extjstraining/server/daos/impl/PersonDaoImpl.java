package com.extjstraining.server.daos.impl;

import com.extjstraining.server.models.Person;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Created by sletras on 09/03/2016.
 */
@Repository
public class PersonDaoImpl implements com.extjstraining.server.daos.PersonDao {

    //TODO: Create the DB access using hibernate or other persistency adapter.
    // For now it will be used a fake data table

    private List<Person> people;

    public PersonDaoImpl() {
        people = new ArrayList<>();
        people.add(new Person("Johny22", "johnnyboy", "John", "Stones", "NEO Corp.", "john@johnnys.co.uk", "England", LocalDate.of(1983, Month.FEBRUARY,28), "232525255"));
        people.add(new Person("ElikDas", "johnnyboy", "Elik", "Brammen", "Zenith Das", "zigfa@vasdoost.nl", "Netherlands", LocalDate.of(1972, Month.JANUARY,4), "452911662"));
        people.add(new Person("LukasW", "johnnyboy", "Lukas", "Wust", "Wauldammen.", "karl@wulder.de", "Germany", LocalDate.of(1993, Month.MARCH,12), "259199558"));
        people.add(new Person("ChiaraC", "johnnyboy", "Chiara", "Carlotti", "Genitto.", "cristina@genitto.it", "Italy", LocalDate.of(1935, Month.DECEMBER,24), "611124155"));
        people.add(new Person("Mangel", "johnnyboy", "Marla", "Angel", "Cadena Sport", "marla@cucadena.es", "Spain", LocalDate.of(1986, Month.AUGUST,15), "325252111"));
        people.add(new Person("ToFaria", "johnnyboy", "Antonio", "Faria", "Sapo.", "pimpao@sapo.pt", "Portugal", LocalDate.of(1989, Month.APRIL,21), "141555255"));
    }

    @Override
    public Person saveOrUpdate(Person person){
        Person oldPerson = this.get(person.getUserId());
        if(oldPerson == null)
            people.add(person);
        else
            people.set(people.indexOf(oldPerson), person);

        return person;
    }

    @Override
    public Person get(String userId){
        Optional<Person> person = people.stream().filter(p -> p.getUserId().equals(userId)).findFirst();
        if(person.isPresent())
            return person.get();
        else
            return null;
    }

    @Override
    public List<Person> get(){
        return people;
    }

    @Override
    public Person delete(Person person){
        people.remove(person);
        return person;
    }

}
