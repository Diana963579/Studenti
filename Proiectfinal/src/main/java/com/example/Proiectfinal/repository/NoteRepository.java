package com.example.Proiectfinal.repository;

import com.example.Proiectfinal.entity.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository

public interface NoteRepository extends JpaRepository<Nota, Long> {

    // Găsește toate notele pentru un student specific
    List<Nota> findByStudentId(Long studentId);

    List<Nota> findByCursId(Long cursId);

    List<Nota> findByStudentIdAndCursId(Long studentId, Long cursId);

    List<Nota> findByValoareGreaterThanEqual(int valoare);

    List<Nota> findByValoareLessThan(int valoare);
}