package fr.projetgraine.business;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Jardinier extends Utilisateur {
    @Past(message = "La date de naissance doit être dans le passé")
    private LocalDate dateDeNaissance;
    @OneToMany
    private List<Commande> commandes;
    @OneToMany
    private List<Recette> recettes;
}
