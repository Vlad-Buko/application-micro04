package com.app.ua.model;

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
}
