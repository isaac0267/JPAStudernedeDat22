package com.example.jpastudernededat22.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record StudentDTO(int id, String name, LocalDate bornData, LocalTime bornTime) {

}
