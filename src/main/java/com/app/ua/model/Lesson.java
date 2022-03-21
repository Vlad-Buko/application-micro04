package com.app.ua.model;

import lombok.Data;

/**
 * Author Vladislav Domaniewski 04
 */

@Data
public class Lesson {
    private Long id;
    private String lessonName;
    private String lessonNote;
    private String date;
}
