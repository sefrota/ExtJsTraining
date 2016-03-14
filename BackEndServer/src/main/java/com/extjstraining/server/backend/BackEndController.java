package com.extjstraining.server.backend;

import com.extjstraining.server.models.Person;
import com.extjstraining.server.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sletras on 09/03/2016.
 */
@RestController
public class BackEndController {

    @Autowired
    private PersonService personService;

    @Autowired
    public BackEndController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping("/people")
    public
    @ResponseBody
    Map<String,List<Person>> getPeople() {
        List<Person> list = personService.getPeople();
        Map<String, List<Person>> result = new HashMap<>();
        result.put("people", list);
        return result;
    }
}
