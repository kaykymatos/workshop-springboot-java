package com.github.kaykymatos.course.services;

import com.github.kaykymatos.course.entities.Order;
import com.github.kaykymatos.course.repositories.OrderRepository;
import com.github.kaykymatos.course.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> fidAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> order = repository.findById(id);
        return order.orElseThrow(() -> new ResourceNotFoundException(id));
    }
}
