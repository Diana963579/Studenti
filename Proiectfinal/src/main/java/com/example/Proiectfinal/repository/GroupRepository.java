package com.example.Proiectfinal.repository;

import com.example.Proiectfinal.entity.Grup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GroupRepository extends JpaRepository<Grup, Long> {
    Optional<Grup> findById(Long id);
}