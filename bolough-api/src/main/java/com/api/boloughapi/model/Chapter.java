package com.api.boloughapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @Builder
@Table(name = "chapterAr")
public class Chapter {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kitabId", referencedColumnName = "id")
    private Kitab kitab;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chapter )) return false;
        return id != null && id.equals(((Chapter) o).getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
