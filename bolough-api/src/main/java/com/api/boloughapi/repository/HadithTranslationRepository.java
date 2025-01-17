package com.api.boloughapi.repository;

import com.api.boloughapi.model.translation.HadithTranslation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HadithTranslationRepository extends JpaRepository<HadithTranslation, Long> {
}