package com.app.ua.model;

import com.app.ua.entity.LessonEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author Vladislav Domaniewski 04
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {
    private Long id;
    private String lessonName;
    private String lessonNote;
    private String date;

    public static Lesson toModel(LessonEntity lessonEntity) {
        Lesson lessonModel = new Lesson();
        lessonModel.setId(lessonEntity.getId());
        lessonModel.setLessonName(lessonEntity.getLessonName());
        lessonModel.setLessonNote(lessonEntity.getLessonNote());
        lessonModel.setDate(lessonEntity.getDate());
        return lessonModel;
    }
}
