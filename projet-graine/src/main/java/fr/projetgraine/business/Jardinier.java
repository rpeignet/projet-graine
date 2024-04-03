package fr.projetgraine.business;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

@Entity
public class Jardinier extends Utilisateur {
    @Past(message = "La date de naissance doit être dans le passé")
    private LocalDate dateDeNaissance;
}
