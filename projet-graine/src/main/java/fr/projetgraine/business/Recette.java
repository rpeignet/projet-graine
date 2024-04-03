package fr.projetgraine.business;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
public class Recette {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "L'intitulé de la recette ne doit pas être null")
    @NotBlank(message = "L'intitulé de la recette ne doit pas être vide")
    private String intitule;

    private String contenu;

    @ManyToMany(mappedBy = "recettes")
    private List<TypeDeGraine> typeDeGraines;

    @ManyToOne
    @JoinColumn(name = "jardinier_id")
    private Jardinier jardinier;
}
