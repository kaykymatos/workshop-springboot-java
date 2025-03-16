package com.github.kaykymatos.course.repositories;

import com.github.kaykymatos.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
