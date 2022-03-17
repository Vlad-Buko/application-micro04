package com.app.ua.service;

import com.app.ua.entity.StudentEntity;
import com.app.ua.entity.TeamEntity;
import com.app.ua.model.Student;
import com.app.ua.model.Team;
import com.app.ua.repository.StudentRepository;
import com.app.ua.repository.TeamRepository;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentService service;

    @Autowired
    private TeamService teamService;

    @MockBean
    private StudentRepository repo;

    @MockBean
    private TeamEntity teamEntity;

    @MockBean
    private TeamRepository teamRepository;

    @Test
    void createTeam() throws Exception {
        TeamEntity teamEntity = new TeamEntity();
        boolean teamIsCreated = teamService.setTeam(teamEntity);
        Assert.assertTrue(teamIsCreated);
    }

    @Test
    @Ignore
     void createStudent() {
        StudentEntity studentEntity = new StudentEntity(1l,"vasa","petrov",0.0, null,1l);

        Student st1 = service.createStudent(studentEntity, 1l);
        Assert.assertEquals(studentEntity,  st1);
    }
}