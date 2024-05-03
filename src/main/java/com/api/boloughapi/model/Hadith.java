package com.api.boloughapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Hadith {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String hadithName;
    private String isnaad;
    private String matn;
    private String takhrij;
    @Column(columnDefinition = "TEXT")
    private String tahkeek;

    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name="chapter_id")
    private Chapter chapter;
}
