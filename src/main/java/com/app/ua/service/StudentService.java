package com.app.ua.service;

import com.app.ua.entity.StudentEntity;
import com.app.ua.entity.TeamEntity;
import com.app.ua.repository.StudentRepository;
import com.app.ua.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepos;
    @Autowired
    private TeamRepository teamRepos;

    public StudentEntity createStudent(StudentEntity student, Integer teamId) {
        TeamEntity team = teamRepos.findById(teamId).get();
        student.setTeam(team);
        return studentRepos.save(student);
    }

    public StudentEntity complete(Integer id) {
        StudentEntity student = studentRepos.findById(id).get();
        return studentRepos.save(student);
    }
}
