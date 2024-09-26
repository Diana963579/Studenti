package com.example.Proiectfinal.mappers;

import com.example.Proiectfinal.dto.StudentDto;
import com.example.Proiectfinal.entity.Student;

public class StudentMapper {

    // Metoda pentru a transformarea unui Student în StudentDTO
    public static StudentDto toDTO(Student student) {
        if (student == null) {
            return null;
        }
        return new StudentDto(student.getId(), student.getNume(), student.getPrenume(), student.getAge(), student.getNivelStudiu(), student.getNumarMatricol());
    }

    // Metoda pentru a transformarea unui StudentDTO în Student
    public static Student toEntity(StudentDto studentDTO) {
        if (studentDTO == null) {
            return null;
        }
        return new Student(studentDTO.getId(), studentDTO.getNume(), studentDTO.getPrenume(), studentDTO.getAge(), null,studentDTO.getNumarMatricol());
        // NivelStudiu este null, pentru că nu este parte din DTO.
    }
}