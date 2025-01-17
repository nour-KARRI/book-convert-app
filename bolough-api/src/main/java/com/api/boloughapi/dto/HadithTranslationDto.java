package com.api.boloughapi.dto;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class HadithTranslationDto {
	private Long id;
	private String langCode;
	private String name;
	private String isnaad;
	private String matn;
	private String takhrij;
	private String hamesh;
}