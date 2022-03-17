package com.app.ua.entity;

import lombok.extern.java.Log;

import javax.persistence.*;

@Log
public class LessonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nameLesson;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lessonsEntity")
//    private List<TeamEntity> teamEntities;
}
