package com.app.ua.model;

import lombok.Data;

import java.util.List;

/**
 * Author Vladislav Domaniewski 04
 */

@Data
public class Lesson {
    private Long id;
    private String lessonName;
    private String lessonNote;
    private List<Team> teams;
    private String date;
}
