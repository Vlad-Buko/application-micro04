package com.app.ua.controller;

import com.app.ua.entity.LessonEntity;
import com.app.ua.model.Lesson;
import com.app.ua.repository.LessonRepository;
import com.app.ua.service.LessonService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log
@RestController
@RequestMapping("/lessons")
public class LessonController {
    @Autowired
    private LessonRepository lessonRepository;

    @Autowired
    private LessonService lessonService;

    @PostMapping("/save")
    public void createStudent(@RequestBody LessonEntity lessonEntity) {
        log.info("Save student ");
        lessonService.createLesson(lessonEntity);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteLesson(@PathVariable Long id) {
        lessonService.deleteLesson(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findAll")
    public List<Lesson> findAllGroup () {
        return lessonService.findAll();
    }
}
