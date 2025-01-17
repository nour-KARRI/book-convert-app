package com.api.boloughapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @Builder
@Table(name = "kitabAr")
public class Kitab {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String audio;
    private String title;
    @OneToMany(mappedBy = "kitab", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Chapter> chapters = new ArrayList<>();
}
