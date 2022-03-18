package com.app.ua.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Author Vladislav Domaniewski 04
 */

@Data
@Entity
@Table(name = "team")
@NoArgsConstructor
@AllArgsConstructor
public class TeamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nameTeam;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team")
    private List<StudentEntity> studentEntities;

    @Column(name = "score_team")
    private double ScoreTeam;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private LessonEntity lesson;

}
