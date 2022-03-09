package com.app.ua.repository;

import com.app.ua.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author Vladislav Domaniewski 04
 */

public interface StudentRepository extends JpaRepository <StudentEntity, Integer> {
}
