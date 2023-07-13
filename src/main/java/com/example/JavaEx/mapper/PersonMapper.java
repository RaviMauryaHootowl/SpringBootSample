package com.example.JavaEx.mapper;

import com.example.JavaEx.domain.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper {

    public List<Person> getAllPersons();
}
