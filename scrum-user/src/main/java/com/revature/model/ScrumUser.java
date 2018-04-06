package com.revature.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "SCRUM_USER")
public class ScrumUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    @JsonIgnore
    private String password;
    private String firstName;
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "ROLE_ID")
    private Role role;

    @JsonIgnore
    @OneToMany(mappedBy = "scrumUser")
    private Set<BoardUserJoin> boardUserJoins;

    public ScrumUser() {}

    public ScrumUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<BoardUserJoin> getBoardUserJoins() {
        return boardUserJoins;
    }

    public void setBoardUserJoins(Set<BoardUserJoin> boardUserJoins) {
        this.boardUserJoins = boardUserJoins;
    }
}
