package com.app.ua.service;

import com.app.ua.entity.TeamEntity;
import com.app.ua.repository.TeamRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class TeamServiceTest {
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private TeamService teamService;


    @Before
    public void createTeam() {
        TeamEntity teamEntity = new TeamEntity(1l, "Team2", null,  0.0, null);
        teamRepository.save(teamEntity);
    }

    @Test
    void delete() {
        Long expected = 1l;
        Long actual = teamService.delete(expected);
        Assert.assertEquals(expected, actual);
    }
}