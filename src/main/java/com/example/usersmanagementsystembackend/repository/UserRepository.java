package com.example.usersmanagementsystembackend.repository;

import com.example.usersmanagementsystembackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
