package com.app.ua.model;

import lombok.Data;

import java.util.List;

/**
 * Author Vladislav Domaniewski 04
 */

@Data
public class Team {
    private Long id;
    private String nameTeam;
    private double teamScore;
    private List<Student> students;
}
