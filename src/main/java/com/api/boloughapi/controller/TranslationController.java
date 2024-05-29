package com.api.boloughapi.controller;

import com.api.boloughapi.dto.HadithTransDto;
import com.api.boloughapi.service.TranslationService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	ResponseEntity<String> save(@RequestBody HadithTransDto dto){
		translationService.save(dto);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}