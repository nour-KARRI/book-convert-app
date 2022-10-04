package com.api.bolough.model;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "french_name", length = 256)
    private String FrenchName;

    @Column(name = "arabic_name", length = 256)
    private String arabicName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrenchName() {
        return FrenchName;
    }

    public void setFrenchName(String frenchName) {
        FrenchName = frenchName;
    }

    public String getArabicName() {
        return arabicName;
    }

    public void setArabicName(String arabicName) {
        this.arabicName = arabicName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", FrenchName='" + FrenchName + '\'' +
                ", arabicName='" + arabicName + '\'' +
                '}';
    }
}
