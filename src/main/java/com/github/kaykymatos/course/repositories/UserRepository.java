package com.github.kaykymatos.course.repositories;

import com.github.kaykymatos.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
