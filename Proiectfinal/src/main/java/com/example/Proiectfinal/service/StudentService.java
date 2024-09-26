package com.example.Proiectfinal.service;

import com.example.Proiectfinal.entity.Student;
import com.example.Proiectfinal.enums.NivelStudiu;
import com.example.Proiectfinal.exceptions.StudentNotFoundException;
import com.example.Proiectfinal.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    public Student creeazaStudent(Long id, String nume, String prenume, int age, String nivelStudiu, String numarMatricol) {
        // Creează un obiect Student folosind parametrii primiți
        return new Student(id, nume, prenume, age, nivelStudiu,numarMatricol);
    }
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student gasesteStudentDupaId(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Studentul cu id-ul " + id + " nu a fost găsit"));
    }

    public List<Student> gasesteStudentiDinGrup(Long grupId) {
        List<Student> studenti = studentRepository.findByGrupId(grupId);
        if (studenti.isEmpty()) {
            throw new StudentNotFoundException("Nu au fost găsiți studenți în grupul cu id-ul " + grupId);
        }
        return studenti;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id " + id));
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student studentDetails) {
        Student student = getStudentById(id);
        student.setNume(studentDetails.getNume());
        student.setPrenume(studentDetails.getPrenume());
        student.setNumarMatricol(studentDetails.getNumarMatricol());
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
