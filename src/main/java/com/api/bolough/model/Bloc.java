package com.api.bolough.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bloc {

    @Id
    private Long id;

    @Column(name = "french_titre", length = 256)
    private String frTitre;

    @Column(name = "arabic_titre", length = 256)
    private String arTitre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrTitre() {
        return frTitre;
    }

    public void setFrTitre(String frTitre) {
        this.frTitre = frTitre;
    }

    public String getArTitre() {
        return arTitre;
    }

    public void setArTitre(String arTitre) {
        this.arTitre = arTitre;
    }


    @Override
    public String toString() {
        return "Bloc{" +
                "id=" + id +
                ", frTitre='" + frTitre + '\'' +
                ", arTitre='" + arTitre + '\'' +
                '}';
    }
}
