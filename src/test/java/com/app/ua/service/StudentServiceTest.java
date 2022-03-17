package com.app.ua.service;

import com.app.ua.entity.StudentEntity;
import com.app.ua.repository.StudentRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentService service;

    @MockBean
    private  StudentRepository repo;

    @MockBean
    private TeamService teamService;

    @Test
    void createStudent() {
        StudentEntity studentEntity = new StudentEntity();
        Assert.assertEquals(studentEntity,service.createStudent(studentEntity,0l));

    }
}