package com.app.ua.service;

import com.app.ua.repository.StudentRepository;
import com.app.ua.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Author Vladislav Domaniewski 04
 */

@Service
public class UpdateTeamScore {
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private StudentRepository studentRepository;

    public void updateTeam(Long studentId) {

    }
}
