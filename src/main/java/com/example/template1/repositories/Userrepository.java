package com.example.template1.repositories;

import com.example.template1.entités.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<User, Integer> {

    User findByFNameAndIName(String firstName, String lastName);
}
