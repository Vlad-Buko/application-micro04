package com.app.ua.model;

import com.app.ua.entity.TeamEntity;
import lombok.Data;

/**
 * Author Vladislav Domaniewski 04
 */

@Data
public class Team {
    private Long id;
    private String nameTeam;

    public static Team toModel (TeamEntity entity) {
        Team model = new Team();
        model.setId(entity.getId());
        model.setNameTeam(entity.getNameTeam());
        return model;
    }
}
