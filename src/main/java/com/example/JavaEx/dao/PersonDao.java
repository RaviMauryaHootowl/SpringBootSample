package com.example.JavaEx.dao;

import com.example.JavaEx.domain.Person;
import com.example.JavaEx.mapper.PersonMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public class PersonDao {

    @Autowired
    private PersonMapper personMapper;

    public List<Person> getAllPersons(){
        return personMapper.getAllPersons();
    }

}
