package com.example.proiectfrumos_bkd;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> getUserByEmail(String email);
    Optional<User> getUserByUsername(String username);
}
