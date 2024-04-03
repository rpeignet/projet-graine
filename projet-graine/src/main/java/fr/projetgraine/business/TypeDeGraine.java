package fr.projetgraine.business;

import jakarta.persistence.*;

@Entity
public class TypeDeGraine {
    @Id
    @GeneratedValue
    private Long id;

    private String nom;

    private String description;

    private int semaineDePlantationMin;

    private int semaineDePlantationMax;

    private float espacementEntrePiedsEnCentimetre;

    private float espacementEntreLignesEnCentimetre;

    private String conseil;

    @ManyToOne
    @JoinColumn(name = "famille_id")
    private Famille famille;
}
