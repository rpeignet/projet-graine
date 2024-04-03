package fr.projetgraine.business;

import jakarta.persistence.*;

import java.util.List;

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
    @OneToMany(mappedBy = "typeDeGraine")
    private List<Sachet> sachets;
    @ManyToMany
    @JoinTable(
            name = "typeDeGraine_recette",
            joinColumns = @JoinColumn(name = "typeDeGraine_id"),
            inverseJoinColumns = @JoinColumn(name = "recette_id")
    )
    private List<Recette> recettes;
}
