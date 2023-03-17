package com.example.template1.entités;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String email;
    private String pwd;
    private String IName;
    private String fName;
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToMany
    public List<Project> projects;
    @ManyToMany(mappedBy = "users")
    public List <Project> projectlist;
}
