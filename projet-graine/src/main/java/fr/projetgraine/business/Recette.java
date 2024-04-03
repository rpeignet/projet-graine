package fr.projetgraine.business;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Recette {
    @Id
    @GeneratedValue
    private Long id;

    private String intitule;

    private String contenu;

    @ManyToMany(mappedBy = "recettes")
    private List<TypeDeGraine> typeDeGraines;

    @ManyToOne
    @JoinColumn(name = "jardinier_id")
    private Jardinier jardinier;
}
