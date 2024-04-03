package fr.projetgraine.business;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Jardinier extends Utilisateur {
    private LocalDate dateDeNaissance;
}
