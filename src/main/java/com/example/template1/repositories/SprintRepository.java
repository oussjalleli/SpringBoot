package com.example.template1.repositories;

import com.example.template1.entités.Sprint;
import com.example.template1.entités.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SprintRepository extends JpaRepository<Sprint, Integer> {
}
