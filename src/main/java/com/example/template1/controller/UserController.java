package com.example.template1.controller;

import com.example.template1.entités.Project;
//import com.example.template1.entités.Skieur;
import com.example.template1.entités.Sprint;
import com.example.template1.entités.User;
//import com.example.template1.service.IServiceSkieur;
import com.example.template1.service.IServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("test")
public class UserController {
    @Autowired
    IServiceUser serviceUser;
    @Autowired
    IServiceUser serviceProject;
    @Autowired
    IServiceUser serviceSprint;
    @PostMapping("/User")
    public User addUser(@RequestBody User user){
        return serviceUser.addUser(user);
    }

    @PostMapping("/Project")
    public Project addProject(@RequestBody Project project){
        return serviceProject.addProject(project);
    }

    @PostMapping("/Sprint")
    public Sprint addSprint(@RequestBody Sprint sprint){
        return serviceSprint.addSprint(sprint);
    }

    /*
    @PutMapping
    public Skieur updateSkieur(@RequestBody Skieur skieur)
    {
        return serviceSkieur.updateSkieur(skieur);
    }
    @DeleteMapping("/{numSkieur}")
    public void deleteSkieur(@PathVariable Long numSkieur){
        serviceSkieur.removeSkieur(numSkieur);
    }
    @GetMapping
    public List<Skieur> getSkieur(){
        return serviceSkieur.getSkieurs();
    }
    @GetMapping("/{numSkieur}")
    public Skieur getSkieurById(@PathVariable Long numSkieur){
        return serviceSkieur.getSkieurByNumSkieur(numSkieur);
    }
*/
}
