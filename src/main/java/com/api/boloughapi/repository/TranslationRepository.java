package com.api.boloughapi.repository;

import com.api.boloughapi.model.translation.HadithTranslation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TranslationRepository extends JpaRepository<HadithTranslation, Long> {
}