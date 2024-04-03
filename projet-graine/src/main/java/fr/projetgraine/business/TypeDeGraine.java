package fr.projetgraine.business;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
public class TypeDeGraine {
    @Id
    @GeneratedValue
    private Long id;

    private String nom;

    @Size(min = 40, message = "La description doit contenir au minimum 40 caractères")
    private String description;

    @Min(value = 1, message = "La semaine de plantation minimale doit être >= 1")
    @Max(value = 52, message = "La semaine de plantation minimale doit être <= 52")
    private int semaineDePlantationMin;

    @Min(value = 1, message = "La semaine de plantation maximale doit être >= 1")
    @Max(value = 52, message = "La semaine de plantation maximale doit être <= 52")
    private int semaineDePlantationMax;

    private float espacementEntrePiedsEnCentimetre;

    private float espacementEntreLignesEnCentimetre;

    private String conseil;

    @NotNull(message = "Le type de graine doit être associé à une famille")
    @ManyToOne
    @JoinColumn(name = "famille_id")
    private Famille famille;

    @ManyToMany
    private List<Recette> recette;
}
