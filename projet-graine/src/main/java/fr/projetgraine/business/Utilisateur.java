package fr.projetgraine.business;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue
    private Long id;

    private String nom;

    private String prenom;

    private String adresseEmail;

    private String motDePasse;

}
