package fr.projetgraine.business;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Famille {
    @Id
    @GeneratedValue
    private Long id;

    private String nom;

    private String couleurRGB;
}
