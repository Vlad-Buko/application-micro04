package com.app.ua.service;

import com.app.ua.entity.LessonEntity;
import com.app.ua.model.Lesson;
import com.app.ua.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Author Vladislav Domaniewski 04
 */

@Service
public class LessonService {
    @Autowired
    private LessonRepository groupRepository;

    public Lesson createLesson(LessonEntity lessonEntity) {
        return Lesson.toModel(groupRepository.save(lessonEntity));
    }

    public void deleteLesson(Long id) {
        groupRepository.deleteById(id);
    }

    public List<Lesson> findAll() {
        return groupRepository.findAll()
                .stream()
                .map(Lesson::toModel)
                .collect(Collectors.toList());
    }
}
