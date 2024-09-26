package com.example.Proiectfinal.service;

import com.example.Proiectfinal.entity.Student;
import com.example.Proiectfinal.enums.StudyLevel;
import com.example.Proiectfinal.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest

public class StudentServiceTest {

    @MockBean
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;

    @Test
    public void testGetStudentById() {

        Student student = new Student();
        student.setId(1L);
        student.setNume("Ion");
        student.setPrenume("Popescu");
        student.setNumarMatricol("CIG");

        Mockito.when(studentRepository.findById(1L)).thenReturn(Optional.of(student));

        Student foundStudent = studentService.getStudentById(1L);

        assertEquals("Ion", foundStudent.getNume());
    }
}
