package com.api.boloughapi.repository;

import com.api.boloughapi.model.translation.HadithTranslation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TranslationRepository extends JpaRepository<HadithTranslation, Long> {
	Optional<HadithTranslation> findByIdAndLanguageCode(Long id, String code);
}