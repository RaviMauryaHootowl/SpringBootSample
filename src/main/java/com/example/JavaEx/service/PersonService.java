package com.example.JavaEx.service;

import com.example.JavaEx.dao.PersonDao;
import com.example.JavaEx.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonService {

    @Autowired
    private PersonDao personDao;

    @GetMapping("/all")
    public List<Person> getAllPersons(){
        return personDao.getAllPersons();
    }

}
