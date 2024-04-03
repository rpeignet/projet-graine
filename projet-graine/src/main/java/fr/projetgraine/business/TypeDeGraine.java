package fr.projetgraine.business;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "type_de_graine")
public class TypeDeGraine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "seedName")
    private String nom;

    @Column(name = "description")
    private String description;

    @Column(name = "minPlantWeek")
    private int semaineDePlantationMin;
    @Column(name = "maxPlantWeek")
    private int semaineDePlantationMax;
    @Column(name = "spaceBtwFeet")
    private float espacementEntrePiedsEnCentimetre;

    @Column(name = "spaceBtwLine")
    private float espacementEntreLignesEnCentimetre;

    @Column(name = "advice")
    private String conseil;

    @ManyToOne
    @JoinColumn(name = "famille_id")
    private Famille famille;
    @OneToMany
    @JoinColumn(name = "sachet_id")
    private List<Sachet> sachets;
    @ManyToMany
    @JoinTable(
            name = "typeDeGraine_recette",
            joinColumns = @JoinColumn(name = "typeDeGraine_id"),
            inverseJoinColumns = @JoinColumn(name = "recette_id")
    )
    private List<Recette> recettes;
}
