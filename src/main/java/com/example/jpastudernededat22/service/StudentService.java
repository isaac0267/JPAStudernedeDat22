package com.example.jpastudernededat22.service;

import com.example.jpastudernededat22.dto.StudentConverter;
import com.example.jpastudernededat22.dto.StudentDTO;
import com.example.jpastudernededat22.expetion.StudentNotFoundException;
import com.example.jpastudernededat22.model.Student;
import com.example.jpastudernededat22.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class StudentService {
// we use the privat final in this class.
// private this keyword indicate that this variable is accessible juts in this class
// Final is mean when we use assigned this value, it means we change it value. This one make the variable effectively
// constant


    private final StudentRepository studentRepository;
    private final StudentConverter studentConverter;

    @Autowired
    public StudentService(
            StudentRepository studentRepository, // we have to have the Repository notation to make sure this code work
            StudentConverter studentConverter   // We have to make the @Component in the studentConverter,to make it work
    ) {
        this.studentRepository = studentRepository;
        this.studentConverter = studentConverter;
    }

    // Now we make the other method,that will we use in the StudentREstController.

    public List<StudentDTO> getAllStudent() {
        List<Student> student = studentRepository.findAll();
        return student.stream()
                .map(studentConverter::toDTO)
                .collect(Collectors.toList());
    }

    // we need to creat other method here to make the toDTO work

    public StudentDTO getStudentById(int id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            return studentConverter.toDTO(optionalStudent.get());
        } else {
            throw new StudentNotFoundException("student not found id:" + id);
        }
    }


}
