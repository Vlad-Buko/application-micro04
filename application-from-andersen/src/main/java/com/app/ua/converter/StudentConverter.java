package com.app.ua.converter;

import com.app.ua.entity.StudentEntity;
import com.app.ua.model.Student;

public class StudentConverter {
    public static Student convertFromStudentEntity(StudentEntity studentEntity) {
        Student modelStudent = new Student();
        modelStudent.setId(studentEntity.getId());
        modelStudent.setName(studentEntity.getName());
        modelStudent.setLastName(studentEntity.getLastName());
        modelStudent.setIdTeam(studentEntity.getTeamId());
        modelStudent.setScore(studentEntity.getScore());
        return modelStudent;
    }
}
