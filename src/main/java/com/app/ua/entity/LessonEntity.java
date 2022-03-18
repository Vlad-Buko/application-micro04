package com.app.ua.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

import javax.persistence.*;
import java.util.List;

@Log
@Data
@Entity
@Table(name = "lessons")
@AllArgsConstructor
@NoArgsConstructor
public class LessonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_lessons")
    private String dateLessons;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lesson")
    private List<GroupEntity> groupEntities;
}
