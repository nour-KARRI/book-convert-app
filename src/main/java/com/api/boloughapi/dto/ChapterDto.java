package com.api.boloughapi.dto;

import lombok.Data;

@Data
public class ChapterDto {
    private String kitab;
    private String chapter;
    private String hadithName;
    private String isnaad;
    private String matn;
    private String takhrij;
    private String tahkeek;
}
