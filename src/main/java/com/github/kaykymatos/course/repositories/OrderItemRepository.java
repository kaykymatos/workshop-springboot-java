package com.github.kaykymatos.course.repositories;

import com.github.kaykymatos.course.entities.OrderItem;
import com.github.kaykymatos.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
