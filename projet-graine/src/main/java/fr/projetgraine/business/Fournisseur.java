package fr.projetgraine.business;

import jakarta.persistence.Entity;

@Entity
public class Fournisseur extends Utilisateur {
    private String numeroPortable;
}
