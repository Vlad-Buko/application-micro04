package com.app.ua.converter;

import com.app.ua.entity.LessonEntity;
import com.app.ua.model.Lesson;

public class LessonConverter {
    public static Lesson convertFromLessonEntity(LessonEntity lessonEntity) {
        Lesson toModel = new Lesson();
        toModel.setId(lessonEntity.getId());
        toModel.setLessonName(lessonEntity.getLessonName());
        toModel.setLessonNote(lessonEntity.getLessonNote());
        toModel.setDate(lessonEntity.getDate());
        return toModel;
    }
}
