package com.api.boloughapi.dto;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class HadithDto {
    private String kitab;
    private String chapter;
    private String langCode;
    private String name;
    private String isnaad;
    private String matn;
    private String takhrij;
    private String hamesh;
    private String basamLink;
    private String san3aniLink;
    private String uthaymeenLink;
}
