package fr.projetgraine.business;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Famille {
    @Id
    @GeneratedValue
    private Long id;

    private String nom;

    private String couleurRGB;

    @OneToMany(mappedBy = "famille")
    private List<TypeDeGraine> typesDeGraine;
}
