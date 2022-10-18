package com.example.sweat.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Vladislav Domaniewski
 */

@Entity
@Table(name = "usr")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private int password;
    private boolean active;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role" , joinColumns = @JoinColumn(name = "user_id"));
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;
}
