package com.api.boloughapi.controller;

import com.api.boloughapi.dto.HadithDto;
import com.api.boloughapi.dto.HadithTransDto;
import com.api.boloughapi.dto.HadithTranslationDto;
import com.api.boloughapi.service.TranslationService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/translation")
public class TranslationController {

	private TranslationService translationService;

	public TranslationController(TranslationService translationService) {
		this.translationService = translationService;
	}

	@PostMapping("/")
	ResponseEntity<String> save(@RequestBody HadithTransDto dto, @RequestHeader(HttpHeaders.ACCEPT_LANGUAGE) String lang){
		translationService.save(dto, lang);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<HadithTranslationDto> getHadithTranslation(@PathVariable Long id, @RequestHeader(HttpHeaders.ACCEPT_LANGUAGE) String lang) {
		return ResponseEntity.ok(translationService.getHadithTranslation(id, lang));
	}

}