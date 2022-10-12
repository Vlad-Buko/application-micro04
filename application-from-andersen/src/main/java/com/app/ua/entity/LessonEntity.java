package com.app.ua.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lesson")
public class LessonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lesson_name")
    private String lessonName;

    @Column(name ="lesson_note")
    private String lessonNote;

    @Column(name = "lesson_date")
    private String date;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lesson")
    private List<TeamEntity> teamEntities;
}
