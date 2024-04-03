package fr.projetgraine.business;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
public class Recette {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "L'intitulé de la recette ne doit pas être null")
    @NotBlank(message = "L'intitulé de la recette ne doit pas être vide")
    private String intitule;

    private String contenu;

    @ManyToMany
    private List<TypeDeGraine> typeDeGraines;
}
