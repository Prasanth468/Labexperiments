
package com.example.studentdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student student() {
        Student s = new Student(102, "Minnu", "Data Science", 2);
        s.setCourse("AI & ML");
        s.setYear(3);
        return s;
    }
}
