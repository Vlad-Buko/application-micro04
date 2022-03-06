package com.app.ua.repository;

import com.app.ua.entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author Vladislav Domaniewski 04
 */

public interface TeamRepository extends JpaRepository <TeamEntity, Integer> {
    TeamEntity findByNameTeam(String nameTeam);
}
