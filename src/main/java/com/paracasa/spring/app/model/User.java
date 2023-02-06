package com.paracasa.spring.app.model;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String password;

    public User(String name) {
        this.setName(name);
        this.setId((long) (Math.random() * (1000 - 1) + 1));
    }

    public User() {
        this.setId((long) (Math.random() * (1000 - 1) + 1));
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String contrasenya) {
        this.password = contrasenya;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
