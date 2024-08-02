package dev.skyllrex.banking.repository;

import java.util.Optional;

import dev.skyllrex.banking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByLogin(String login);
}