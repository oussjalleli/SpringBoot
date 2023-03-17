package com.example.template1.repositories;

import com.example.template1.entités.Project;
import com.example.template1.entités.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
