package com.example.jpastudernededat22.config;


import com.example.jpastudernededat22.model.Student;
import com.example.jpastudernededat22.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner  {
    /*
    We inject the repository by using the Autowired.This repository will be responsible for making the connection
    to the database. or as we call it the CRUD stand for creat, read, update, delete.
     */

 @Autowired
    StudentRepository studentRepository;



    // Now we make a method, that will make a method that called a run CommandLineRunner.
    // This interface allows you to define a custom method that will be executed when your spring boot application
    // start.
    // After we finish the necessary attribut and the method in the student class,now we can finish this method.

    @Override
    public void run(String... args) throws Exception {
    // We make a constructor
    // we do not use the id, beacuse it will genrete by it own.
        Student s1=new Student();
        s1.setName("Isaac");
        s1.setBornData(LocalDate.of(1997,02,28));
        s1.setBornTime(LocalTime.of(23,02,33));
        studentRepository.save(s1);


    }



}
