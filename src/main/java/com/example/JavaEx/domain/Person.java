package com.example.JavaEx.domain;

import com.example.JavaEx.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private Integer id;
    private String firstName;
    private String lastName;
    private Gender gender;
}
