package com.app.ua.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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
    private Integer id;

    @Column
    private String name;

    @Column
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamEntity team;

    @Column(name = "team_id", insertable = false, updatable = false)
    private Integer teamId;

}
