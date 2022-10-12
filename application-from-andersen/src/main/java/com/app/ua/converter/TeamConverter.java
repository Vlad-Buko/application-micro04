package com.app.ua.converter;

import com.app.ua.entity.TeamEntity;
import com.app.ua.model.Team;

public class TeamConverter {
    public static Team convertFromTeamEntityInModelTeam (TeamEntity teamEntity) {
        Team modelTeam = new Team();
        modelTeam.setId(teamEntity.getId());
        modelTeam.setNameTeam(teamEntity.getNameTeam());
        modelTeam.setTeamScore(teamEntity.getScoreTeam());
        return modelTeam;
    }
}
