package com.example.demo.repository;

 
import org.springframework.data.jpa.repository.JpaRepository;
 

import com.example.demo.entities.User;

//@RepositoryRestResource(path = "rest")
public interface UserInterface extends JpaRepository<User, Long> {
}
