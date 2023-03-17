package com.example.template1.service;

import com.example.template1.entités.Project;
import com.example.template1.entités.Sprint;
import com.example.template1.entités.User;

import java.util.List;

public interface IServiceUser {
    User addUser(User user);
    Project addProject(Project project);
    Sprint addSprint(Sprint sprint);
    public void assignProjectToUser (int projectId, int userId);
    public void assignProjectToClient(int projectId, String firstName, String lastName);
    public List<Project> getAllCurrentProject() ;
    //public List<Project> getProjectsByScrumMaster(String fName, String lName)
    User updateUser(User user);
    void removeUser(long id);
    List<User> getUsers();
    User getSkieurByNumUser(Long id);
}
