package com.app.ua.service;

import com.app.ua.entity.StudentEntity;
import com.app.ua.entity.TeamEntity;
import com.app.ua.model.Student;
import com.app.ua.repository.StudentRepository;
import com.app.ua.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public Student createStudent(StudentEntity student, Integer teamId) {
        TeamEntity team = teamRepos.findById(teamId).get();
        student.setTeam(team);
        return Student.toModel(studentRepos.save(student));
    }

    public StudentEntity complete(Integer id) {
        StudentEntity student = studentRepos.findById(id).get();
        return studentRepos.save(student);
    }

    public void deleteStudent(Integer id) {
        studentRepos.deleteById(id);
    }

    public List<Student> findAll() {
        return studentRepos.findAll()
                .stream()
                .map(Student::toModel)
                .collect(Collectors.toList());
    }
}
