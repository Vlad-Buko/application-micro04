package com.app.ua.controller;

import com.app.ua.entity.StudentEntity;
import com.app.ua.entity.TeamEntity;
import com.app.ua.repository.StudentRepository;
import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@WebMvcTest(StudentController.class)
class StudentControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StudentRepository repo;
    @MockBean
    private TeamEntity teamEntity;

    @Test
    void findAllStudents  () throws Exception {
       StudentEntity student1 = new StudentEntity(1l,"vasa","petrov",0.0,teamEntity,1l);
       StudentEntity student2 = new StudentEntity(2l,"ivan","petrov",0.0,teamEntity,1l);
        Mockito.when(repo.findAll()).thenReturn(Arrays.asList(student1, student2));

        mockMvc.perform(
                get("/students"))
                .andExpect(status().isOk());

    }

    @Test
    void deleteStudent() {
    }
}