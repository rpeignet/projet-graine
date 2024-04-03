package fr.projetgraine.business;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

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

    @Size(min = 40, message = "La description doit contenir au minimum 40 caractères")
    @Column(name = "description")
    private String description;


    @Min(value = 1, message = "La semaine de plantation minimale doit être >= 1")
    @Max(value = 52, message = "La semaine de plantation minimale doit être <= 52")
    @Column(name = "minPlantWeek")
    private int semaineDePlantationMin;

    @Min(value = 1, message = "La semaine de plantation maximale doit être >= 1")
    @Max(value = 52, message = "La semaine de plantation maximale doit être <= 52")
    @Column(name = "maxPlantWeek")
    private int semaineDePlantationMax;
    @Column(name = "spaceBtwFeet")
    private float espacementEntrePiedsEnCentimetre;

    @Column(name = "spaceBtwLine")
    private float espacementEntreLignesEnCentimetre;

    @Column(name = "advice")
    private String conseil;

    @NotNull(message = "Le type de graine doit être associé à une famille")
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

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }
}
