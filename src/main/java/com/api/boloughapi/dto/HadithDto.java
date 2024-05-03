package com.api.boloughapi.dto;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class HadithDto {
    private String hadithName;
    private String isnaad;
    private String matn;
    private String takhrij;
    private String tahkeek;
}
