package com.springbootsecure.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    private String id;

    private String username;

    private String password;

    private int role;

    public User() {
    }

    public User(String username, String password, int role) {
        this.setUsername(username);
        this.setPassword(password);
        this.setRole(role);

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{"
                + "id='" + id + "'"
                + ", username='" + username + "'"
                + ", password='" + password + "'"
                + ", role='" + role + "'"
                + '}';
    }
}
