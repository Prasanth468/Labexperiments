package com.college.autowiringdemo;

import org.springframework.stereotype.Component;

@Component
public class Certificate {

    private int id = 401;
    private String name = "Spring Boot";
    private String dateOfCompletion = "23-01-2026";

    @Override
    public String toString() {
        return "Certification [id=" + id +
               ", name=" + name +
               ", dateOfCompletion=" + dateOfCompletion + "]";
    }
}