package com.thryve.pgfinder.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;

    @Column(nullable = false, unique = true)
    private String username;

    private String password;
    private String userEmail;

    @Column(nullable = false)
    private String role; // USER, ADMIN, PG_OWNER
}
