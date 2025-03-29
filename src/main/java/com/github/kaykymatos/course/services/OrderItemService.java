package com.github.kaykymatos.course.services;

import com.github.kaykymatos.course.entities.OrderItem;
import com.github.kaykymatos.course.repositories.OrderItemRepository;
import com.github.kaykymatos.course.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {
    @Autowired
    private OrderItemRepository repository;

    public List<OrderItem> fidAll() {
        return repository.findAll();
    }

    public OrderItem findById(Long id) {
        Optional<OrderItem> orderItem = repository.findById(id);
        return orderItem.orElseThrow(() -> new ResourceNotFoundException(id));
    }
}
