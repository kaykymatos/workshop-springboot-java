package com.github.kaykymatos.course.repositories;

import com.github.kaykymatos.course.entities.Category;
import com.github.kaykymatos.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
