package com.college.autowiringdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id = 1;
    private String name = "Prasanth";
    private String gender = "Male";

    @Autowired
    private Certificate certification;

    @Override
    public String toString() {
        return "Student [id=" + id +
               ", name=" + name +
               ", gender=" + gender +
               ", " + certification + "]";
    }
}