package fr.projetgraine.business;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Jardinier extends Utilisateur {
    private LocalDate dateDeNaissance;
    @OneToMany
    private List<Commande> commandes;
    @OneToMany
    private List<Recette> recettes;
}
