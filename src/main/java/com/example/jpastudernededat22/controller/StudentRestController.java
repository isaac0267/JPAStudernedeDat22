package com.example.jpastudernededat22.controller;

import com.example.jpastudernededat22.dto.StudentDTO;
import com.example.jpastudernededat22.model.Student;
import com.example.jpastudernededat22.repository.StudentRepository;
import com.example.jpastudernededat22.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
This class is like the controller class that we had in the second semester.We use this class to write all the necessary
method like for example we write CRUD list. we add another one which is the put method.
 */
@CrossOrigin
@RestController
public class StudentRestController {

    @Autowired
    StudentService studentService;
    // Now we can write the methods that we need. First the get method.
    // Now we write a method, that will make sure, to return the name of the student
    // The ResponsEntity this will return an HTTP respond that containing a list of the student

    @GetMapping("/student")
    public ResponseEntity<List<StudentDTO>> getAllStudent() {
    List<StudentDTO>studentDTOList=studentService.getAllStudent();
    return new ResponseEntity<>(studentDTOList, HttpStatus.OK);

    }


}
