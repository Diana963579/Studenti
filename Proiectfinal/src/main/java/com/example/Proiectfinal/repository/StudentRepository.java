package com.example.Proiectfinal.repository;

import com.example.Proiectfinal.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

//TODO DE VERIF ADNOTAREA @Query  custom
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByGrupId(Long grupId);
}
