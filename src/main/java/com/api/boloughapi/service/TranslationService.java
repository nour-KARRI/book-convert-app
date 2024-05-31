package com.api.boloughapi.service;

import com.api.boloughapi.dto.HadithTransDto;
import com.api.boloughapi.dto.HadithTranslationDto;
import com.api.boloughapi.model.Hadith;
import com.api.boloughapi.model.Language;
import com.api.boloughapi.model.translation.HadithTranslation;
import com.api.boloughapi.repository.HadithRepository;
import com.api.boloughapi.repository.LanguageRepository;
import com.api.boloughapi.repository.TranslationRepository;
import org.springframework.stereotype.Service;

@Service
public class TranslationService {

	private TranslationRepository translationRepository;
	private LanguageRepository languageRepository;
	private HadithRepository hadithRepository;

	public TranslationService(TranslationRepository translationRepository, LanguageRepository languageRepository,
			HadithRepository hadithRepository) {
		this.translationRepository = translationRepository;
		this.languageRepository = languageRepository;
		this.hadithRepository = hadithRepository;
	}

	public void save(HadithTransDto dto, String lang) {
		Language language = languageRepository.findByCode(lang).orElse(null);
		Hadith hadith = hadithRepository.findById(1L).orElse(null);

		HadithTranslation hadithTranslation = HadithTranslation.builder()
				.language(language)
				.name(dto.getName())
				.isnaad(dto.getIsnaad())
				.matn(dto.getMatn())
				.takhrij(dto.getTakhrij())
				.hamesh(dto.getHamesh())
				.hadith(hadith)
				.build();
		translationRepository.save(hadithTranslation);
	}

	public HadithTranslationDto getHadithTranslation(Long id, String lang) {

		HadithTranslation hadith = translationRepository.findByIdAndLanguageCode(id, lang).orElse(null);

		return	HadithTranslationDto.builder()
				.id(hadith.getId())
				.langCode(hadith.getLanguage().getCode())
				.name(hadith.getName())
				.isnaad(hadith.getIsnaad())
				.matn(hadith.getMatn())
				.takhrij(hadith.getTakhrij())
				.hamesh(hadith.getHamesh())
				.build();
	}
}