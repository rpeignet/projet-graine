package fr.projetgraine.business;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
public class Famille {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @Size(min = 6, max = 6, message = "La couleur doit contenir exactement 6 caractères")
    private String couleurRGB;

    @OneToMany(mappedBy = "famille")
    private List<TypeDeGraine> typesDeGraine;

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }
}
