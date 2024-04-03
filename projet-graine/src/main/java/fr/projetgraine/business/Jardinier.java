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
    @JoinColumn(name = "commande_id")
    private List<Commande> commandes;
}
