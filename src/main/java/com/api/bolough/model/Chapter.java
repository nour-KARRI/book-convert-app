package com.api.bolough.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Chapter {
    @Id
    private Long id;

    @Column(name = "french_name", length = 256)
    private String frenchName;

    @Column(name = "arabic_name", length = 256)
    private String arabicName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrenchName() {
        return frenchName;
    }

    public void setFrenchName(String frenchName) {
        this.frenchName = frenchName;
    }

    public String getArabicName() {
        return arabicName;
    }

    public void setArabicName(String arabicName) {
        this.arabicName = arabicName;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", frenchName='" + frenchName + '\'' +
                ", arabicName='" + arabicName + '\'' +
                '}';
    }
}
