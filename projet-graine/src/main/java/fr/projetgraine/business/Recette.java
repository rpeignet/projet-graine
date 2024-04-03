package fr.projetgraine.business;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Recette {
    @Id
    @GeneratedValue
    private Long id;

    private String intitule;

    private String contenu;

    @ManyToMany
    private List<TypeDeGraine> typeDeGraines;
}
