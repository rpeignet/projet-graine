package fr.projetgraine.business;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
public class Famille {
    @Id
    @GeneratedValue
    private Long id;

    private String nom;

    @Size(min = 6, max = 6, message = "La couleur doit contenir exactement 6 caractères")
    private String couleurRGB;

    @OneToMany(mappedBy = "famille")
    private List<TypeDeGraine> typesDeGraine;
}
