package com.app.ua.model;

import com.app.ua.entity.StudentEntity;
import lombok.Data;

/**
 * Author Vladislav Domaniewski 04
 */

@Data
public class Student {
    private Long id;
    private String name;
    private String lastName;
    private Long idTeam;
    private Double score;

    public static Student toModel(StudentEntity entity) {
        Student model = new Student();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setLastName(entity.getLastName());
        model.setIdTeam(entity.getTeamId());
        model.setScore(entity.getScore());
        return model;
    }
}
