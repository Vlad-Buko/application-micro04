package com.app.ua.controller;

import com.app.ua.entity.LessonEntity;
import com.app.ua.entity.TeamEntity;
import com.app.ua.exception.TeamAlreadyExistException;
import com.app.ua.exception.TeamNotFoundException;
import com.app.ua.model.Team;
import com.app.ua.service.TeamService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author Vladislav Domaniewski 04
 */

@RestController
@RequestMapping("/teams")
@Log
public class TeamController {
    @Autowired
    private TeamService teamService;

    @PostMapping("/save")
    public ResponseEntity createTeam(@RequestBody TeamEntity team) {
        team.setScoreTeam(0.0);
        team.setLesson(new LessonEntity(1l, null, null, null, null));
        log.info("Oke TEAM ADDED");
        try {
            teamService.createTeam(team);
            return ResponseEntity.ok("Our team will be good adding! :)");
        } catch (TeamAlreadyExistException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("It's error ! %(");
        }
    }

    @GetMapping("/chooseTeam")
    public ResponseEntity getTeam(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(teamService.getOne(id));
        } catch (TeamNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("It's error ! %(");
        }
    }

    @GetMapping("/findAll")
    public List<Team> findAllTeam() {
        return teamService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteTeam(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(teamService.delete(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("It's error ! %(");
        }
    }
}
