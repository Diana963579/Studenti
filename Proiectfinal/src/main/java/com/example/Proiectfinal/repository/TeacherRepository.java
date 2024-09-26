package com.example.Proiectfinal.repository;

import com.example.Proiectfinal.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Profesor, String> {
    static Optional<Profesor> findByNume(String nume) {
        return null;
    }

    Optional<Profesor> findById(Long id);
}