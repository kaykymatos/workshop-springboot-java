package com.github.kaykymatos.course.services;

import com.github.kaykymatos.course.entities.Category;
import com.github.kaykymatos.course.repositories.CategoryRepository;
import com.github.kaykymatos.course.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> fidAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> category = repository.findById(id);
        return category.orElseThrow(() -> new ResourceNotFoundException(id));
    }
}
