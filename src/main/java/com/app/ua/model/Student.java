package com.app.ua.model;

import com.app.ua.entity.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
