package com.app.ua.model;

import com.app.ua.entity.StudentEntity;
import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String name;
    private String lastName;

    public static Student toModel(StudentEntity entity) {
        Student model = new Student();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setLastName(entity.getLastName());
        return model;
    }
}
