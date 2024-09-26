package com.example.Proiectfinal.repository;

import com.example.Proiectfinal.entity.Curs;
import com.example.Proiectfinal.entity.Grup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Curs, Long> {
    @Query("SELECT c FROM Curs c WHERE c.grup.id = :grupId")
    List<Curs> findByGrupId(@Param("grupId") Long grupId);
}