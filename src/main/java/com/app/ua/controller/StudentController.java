package com.app.ua.controller;

import com.app.ua.entity.StudentEntity;
import com.app.ua.model.Student;
import com.app.ua.service.StudentService;
import com.app.ua.service.UpdateTeamScore;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author Vladislav Domaniewski 04
 */

@Log
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private UpdateTeamScore updateTeamScore;

    @PostMapping("/save")
    public void createStudent(@RequestBody StudentEntity studentEntity,
                              @RequestParam Long teamId) {
        log.info("Save student " + studentEntity.getName() + " " + studentEntity.getLastName());
        studentService.createStudent(studentEntity, teamId);
    }

    @PutMapping("/update")
    public void updateStudent(@RequestBody StudentEntity student,
                              @RequestParam long studentId) {
        log.info(studentId + "dd");
        double score = student.getScore();
        studentService.addingScore(studentId, score);
    }

    @GetMapping("/findAll")
    public List<Student> findAllStudents() {
        return studentService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        log.info("Student will be removed " + id);
        studentService.deleteStudent(id);
        return ResponseEntity.ok().build();
    }


}
