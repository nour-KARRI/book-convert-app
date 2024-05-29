package com.api.boloughapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.boloughapi.model.Kitab;

public interface KitabRepository extends JpaRepository<Kitab, Long> {
}
