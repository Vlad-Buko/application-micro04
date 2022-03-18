package com.app.ua.model;

import com.app.ua.entity.TeamEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author Vladislav Domaniewski 04
 */

@Data
@NoArgsConstructor
public class Team {
    private Long id;
    private String nameTeam;
    private double teamScore;
    private List<Student> students;

    public static Team toModel (TeamEntity entity) {
        Team model = new Team();
        model.setId(entity.getId());
        model.setNameTeam(entity.getNameTeam());
        model.setTeamScore(entity.getScoreTeam());
        return model;
    }
}
