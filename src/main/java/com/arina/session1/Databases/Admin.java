package com.arina.session1.Databases;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @Column(name = "idadmin", nullable = false)
    private Integer id;

    @Column(name = "login", length = 100)
    private String login;

    @Column(name = "password", length = 100)
    private String password;

}