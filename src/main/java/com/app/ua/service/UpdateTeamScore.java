package com.app.ua.service;

import com.app.ua.entity.StudentEntity;
import com.app.ua.entity.TeamEntity;
import com.app.ua.repository.StudentRepository;
import com.app.ua.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateTeamScore {
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private StudentRepository studentRepository;

    public void updateTeam () {
        for (int i = 0; i < teamRepository.findAll().size(); i++) {
            TeamEntity entity = teamRepository.findAll().get(i);
            for (int z = 0; z < studentRepository.findAll().size(); z++) {
                StudentEntity student = studentRepository.findAll().get(z);
                if (entity.getId() == student.getTeamId()) {
                    double scoreFromStudent = student.getScore();
                    double scoreFromTeam = entity.getScoreTeam();
                    double resultScore = scoreFromStudent + scoreFromTeam;
                    entity.setScoreTeam(resultScore);
                    teamRepository.save(entity);
                }
            }
        }
    }
}
