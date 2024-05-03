package com.api.boloughapi.repository;

import com.api.boloughapi.model.Hadith;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HadithRepository extends JpaRepository<Hadith, Long> {
}
