package fr.projetgraine.business;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue
    protected Long id;

    protected String nom;

    protected String prenom;

    protected String adresseEmail;

    protected String motDePasse;

}
