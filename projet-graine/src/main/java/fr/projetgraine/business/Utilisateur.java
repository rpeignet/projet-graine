package fr.projetgraine.business;

import jakarta.persistence.*;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Long id;

    protected String nom;

    protected String prenom;

    protected String adresseEmail;

    protected String motDePasse;

}
