package com.app.ua.service;

import com.app.ua.entity.StudentEntity;
import com.app.ua.entity.TeamEntity;
import com.app.ua.model.Student;
import com.app.ua.model.Team;
import com.app.ua.repository.StudentRepository;
import com.app.ua.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Author Vladislav Domaniewski 04
 */

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepos;
    @Autowired
    private TeamRepository teamRepos;

    @Autowired
    private UpdateTeamScore updateTeamScore;

    public Student createStudent(StudentEntity studentEntity, Long teamId) {
        TeamEntity team = teamRepos.findById(teamId).get();
        studentEntity.setScore(0.0);
        studentEntity.setTeam(team);
        return Student.toModel(studentRepos.save(studentEntity));
    }

    public StudentEntity addingScore(long id, double score) {
        StudentEntity student = studentRepos.getById(id);
        TeamEntity teamEntity = teamRepos.getById(student.getTeamId());
        Team team = new Team();
        double valueScoreStudent = student.getScore();
        double result = valueScoreStudent + score;
        student.setScore(result);
        System.out.println(student.getTeamId());
        return studentRepos.save(student);
    }



    public void deleteStudent(Long id) {
        studentRepos.deleteById(id);
    }

    public List<Student> findAll() {
        return studentRepos.findAll()
                .stream()
                .map(Student::toModel)
                .collect(Collectors.toList());
    }
}
