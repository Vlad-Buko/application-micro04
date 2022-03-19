package com.app.ua.repository;

import com.app.ua.entity.LessonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author Vladislav Domaniewski 04
 */

public interface LessonRepository extends JpaRepository<LessonEntity, Long> {
}
