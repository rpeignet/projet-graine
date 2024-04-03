package fr.projetgraine.business;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Sachet {
    @Id
    @GeneratedValue
    private Long id;
    private int poidsEnGrammes;
    private float prixEnEuros;
    @ManyToOne
    @JoinColumn(name = "typedegraine_id")
    private TypeDeGraine typeDeGraine;
    @OneToMany
    @JoinColumn(name = "lignecommande_id")
    private List<LigneCommande> lignesCommande;
    @ManyToOne
    @JoinColumn(name = "fournisseur_numerodeportable")
    private Fournisseur fournisseur;
}
