package com.api.boloughapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.boloughapi.model.Kitab;

import java.util.Optional;

public interface KitabRepository extends JpaRepository<Kitab, Long> {
    Optional<Kitab> findByTitle(String title);
}
