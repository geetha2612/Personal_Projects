package com.example.librarymngmnt_app.repository;

import com.example.librarymngmnt_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
