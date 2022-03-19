package com.app.ua.service;

import com.app.ua.entity.TeamEntity;
import com.app.ua.repository.StudentRepository;
import com.app.ua.repository.TeamRepository;
import org.junit.Assert;
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
        boolean teamIsCreated = teamService.createTeam(teamEntity);
        Assert.assertTrue(teamIsCreated);
    }

    @Test
    void deleteTeam() throws Exception {
        TeamEntity teamEntity = new TeamEntity(1l, "Team1", null, 0.0, null);
        teamService.createTeam(teamEntity);
        Long value = teamService.delete(1l);
        Long expected = 1l;
        Assert.assertEquals(expected, value);
    }
}