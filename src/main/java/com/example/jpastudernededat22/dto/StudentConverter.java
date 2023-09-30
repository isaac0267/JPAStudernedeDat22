package com.example.jpastudernededat22.dto;

import com.example.jpastudernededat22.model.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentConverter {
public Student toEntity(StudentDTO studentDTO){
    return new Student(
         studentDTO.id(),
         studentDTO.name(),
         studentDTO.bornData(),
         studentDTO.bornTime()

    );

}
   public StudentDTO toDTO(Student student){
      return new StudentDTO(
          student.getId(),
          student.getName(),
          student.getBornData(),
          student.getBornTime()
      );
   }


}
