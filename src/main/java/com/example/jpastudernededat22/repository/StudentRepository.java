package com.example.jpastudernededat22.repository;

import com.example.jpastudernededat22.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
List<Student>findAllByName(String name);
}
