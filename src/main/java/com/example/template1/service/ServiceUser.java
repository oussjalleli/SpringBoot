package com.example.template1.service;

import com.example.template1.entités.Project;
import com.example.template1.entités.Sprint;
import com.example.template1.entités.User;
import com.example.template1.repositories.ProjectRepository;
import com.example.template1.repositories.SprintRepository;
import com.example.template1.repositories.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceUser implements IServiceUser{
    @Autowired
    Userrepository userRepository;
    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    SprintRepository sprintRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }


    @Override
    public Project addProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Sprint addSprint(Sprint sprint) {
        return sprintRepository.save(sprint);
    }
@Override
    public void assignProjectToUser (int projectId, int userId)
    {
        Project p = projectRepository.findById(projectId).orElse(null);
        Assert.notNull(p,"projet is null");
        User u = userRepository.findById(userId).orElse(null);
        Assert.notNull(p,"user is null");
        List<Project> l = new ArrayList<Project>();
        l.add(p);
        u.setProjects(l);
        userRepository.save(u);
    }

    @Override
    public void assignProjectToClient(int projectId, String firstName, String lastName) {
        Project p = projectRepository.findById(projectId).orElse(null);
        Assert.notNull(p, "projet is null");
        User u = userRepository.findByFNameAndIName(firstName, lastName);
        if (u != null) {
            List<Project> l = new ArrayList<Project>();
            l.add(p);
            u.setProjects(l);
            userRepository.save(u);
        }
    }

    @Override
    public List<Project> getAllCurrentProject() {
        return null;
    }

    @Override
    public List<Project> getProjectsByScrumMaster(String fName, String lName) {
        return null;
    }


    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void removeUser(long id) {

    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User getSkieurByNumUser(Long id) {
        return null;
    }
}
