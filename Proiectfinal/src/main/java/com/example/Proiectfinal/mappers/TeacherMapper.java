package com.example.Proiectfinal.mappers;

import com.example.Proiectfinal.dto.TeacherDto;
import com.example.Proiectfinal.entity.Profesor;
import org.springframework.stereotype.Component;

@Component
public class TeacherMapper {

    public TeacherDto toDto(Profesor profesor) {
        TeacherDto dto = new TeacherDto();
        dto.setId(profesor.getId());
        dto.setNume(profesor.getNume());
        dto.setPrenume(profesor.getPrenume());
        dto.setTitlu(profesor.getTitlu());
        return dto;
    }

    public Profesor toEntity(TeacherDto dto) {
        Profesor profesor = new Profesor();
        profesor.setId(dto.getId());
        profesor.setNume(dto.getNume());
        profesor.setPrenume(dto.getPrenume());
        profesor.setTitlu(dto.getTitlu());
        return profesor;
    }
}