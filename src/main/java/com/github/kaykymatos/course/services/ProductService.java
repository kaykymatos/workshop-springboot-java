package com.github.kaykymatos.course.services;

import com.github.kaykymatos.course.entities.Product;
import com.github.kaykymatos.course.repositories.ProductRepository;
import com.github.kaykymatos.course.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> fidAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> product = repository.findById(id);
        return product.orElseThrow(() -> new ResourceNotFoundException(id));
    }
}
