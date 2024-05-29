package com.api.boloughapi.model.translation;

import com.api.boloughapi.model.Hadith;
import com.api.boloughapi.model.Language;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @Builder
public class HadithTranslation {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String isnaad;
    private String matn;
    private String takhrij;
    @Column(columnDefinition = "TEXT")
    private String hamesh;
    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name="hadith_id")
    private Hadith hadith;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "language_id")
    private Language language;
}