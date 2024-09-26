package com.example.Proiectfinal.advice;

import com.example.Proiectfinal.dto.StudentDto;
import com.example.Proiectfinal.entity.Student;
import com.example.Proiectfinal.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import static com.example.Proiectfinal.enums.NivelStudiu.LICENTA;

@RestController
@RequestMapping({"/api/studenti"})

public class StudentController {

    @GetMapping("/exemplu")
    public String exempluStudent() {
        return "Exemplu student";
    }

    @PostMapping("/adauga")
    public ResponseEntity<String> adaugaStudent(@RequestBody Student student) {
        // logica pentru adăugarea unui student
        return ResponseEntity.ok("Student adăugat");
    }

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> studenti = studentService.getAllStudents();
        return new ResponseEntity<>(studenti, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student newStudent = studentService.addStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id) {
        Student student = studentService.getStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") Long id, @RequestBody Student studentDetails) {
        Student updatedStudent = studentService.updateStudent(id, studentDetails);
        return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") Long id) {
        studentService.deleteStudent(id);
        return new ResponseEntity<>("Student deleted successfully", HttpStatus.OK);
    }

    @PostMapping("/adauga-dto")
    public ResponseEntity<String> adaugaStudent(@RequestBody StudentDto studentDto) {
        // logica pentru adăugarea unui student cu DTO
        return ResponseEntity.ok("Student DTO adăugat");
    }
}
