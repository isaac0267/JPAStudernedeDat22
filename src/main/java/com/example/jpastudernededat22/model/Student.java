package com.example.jpastudernededat22.model;
// In this class we will write some getter and setter
// We will use some notation that we use in the spring boot.
// Look at the other project in the Kommune, that will understand how the thing is working.
// We use the Lomback, that will make os to not use the getter and the setter.
// But to use the Lomback, we have to import that in the pom.xml.

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
/*@Id
@Column(length = 4);

@ManyToOne
@JoinColumn(name="name",referencedColumnName ="id")*/
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int id;
private String name;
private LocalDate bornData;
private LocalTime bornTime;



/*
We do not need this attribut anymore, spo we can remove them.
but we will get error, so we need to add the attribut, but in the different way.
 */

}
