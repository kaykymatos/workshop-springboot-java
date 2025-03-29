package com.github.kaykymatos.course.repositories;

import com.github.kaykymatos.course.entities.Order;
import com.github.kaykymatos.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
