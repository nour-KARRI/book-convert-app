package com.api.boloughapi.model;

import com.api.boloughapi.model.translation.HadithTranslation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @Builder
@Table(name = "hadithAr")
public class Hadith {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String isnaad;
    private String matn;
    private String takhrij;
    @Column(columnDefinition = "TEXT")
    private String hamesh;
    private String basamLink;
    private String san3aniLink;
    @Column(columnDefinition = "TEXT")
    private String uthaymeenLink;
    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name="chapter_id")
    private Chapter chapter;
    @OneToMany(mappedBy = "hadith", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HadithTranslation> hadithTranslations = new ArrayList<>();
}
