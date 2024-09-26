package com.example.Proiectfinal.mappers;

import com.example.Proiectfinal.dto.GroupDto;
import com.example.Proiectfinal.entity.Grup;
import org.springframework.stereotype.Component;

@Component
public class GroupMapper {

    public GroupDto toDto(Grup grup) {
        GroupDto dto = new GroupDto();
        dto.setId(grup.getId());
        dto.setNumeGrup(grup.getNumeGrup());
        return dto;
    }

    public Grup toEntity(GroupDto dto) {
        Grup grup = new Grup();
        grup.setId(dto.getId());
        grup.setNumeGrup(dto.getNumeGrup());
        return grup;
    }
}