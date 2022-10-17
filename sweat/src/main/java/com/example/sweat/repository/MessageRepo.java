package com.example.sweat.repository;

import com.example.sweat.domain.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepo extends CrudRepository<Message, Long> {
}
