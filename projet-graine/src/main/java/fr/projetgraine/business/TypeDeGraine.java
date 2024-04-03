package fr.projetgraine.business;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

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
}
