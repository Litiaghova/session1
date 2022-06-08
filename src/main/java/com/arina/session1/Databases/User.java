package com.arina.session1.Databases;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser", nullable = false)
    private Integer id;

    @Column(name = "login", length = 100)
    private String login;

    @Column(name = "password", length = 100)
    private String password;

    @Column(name = "FIO", length = 100)
    private String fio;

}