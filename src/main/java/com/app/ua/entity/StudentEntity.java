package com.app.ua.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Author Vladislav Domaniewski 04
 */

@Entity
@NoArgsConstructor
@Data
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column
    private double score;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamEntity team;

    @Column(name = "team_id", insertable = false, updatable = false)
    private Integer teamId;
}
