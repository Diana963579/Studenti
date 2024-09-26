package com.example.Proiectfinal.mappers;

import com.example.Proiectfinal.dto.CourseDto;
import com.example.Proiectfinal.entity.Curs;
import com.example.Proiectfinal.entity.Profesor;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {

    public CourseDto toDto(Curs curs) {
        CourseDto dto = new CourseDto();
        dto.setId(curs.getId());
        dto.setNumeCurs(curs.getNumeCurs());
        dto.setProfesorId(curs.getProfesor().getId());
        return dto;
    }

    public Curs toEntity(CourseDto dto, Profesor profesor) {
        Curs curs = new Curs();
        curs.setId(dto.getId());
        curs.setNumeCurs(dto.getNumeCurs());
        curs.setProfesor(profesor);
        return curs;
    }
}