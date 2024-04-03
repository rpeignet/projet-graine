package fr.projetgraine.business;

import jakarta.persistence.*;

@Entity
public class LigneCommande {
    @Id
    @GeneratedValue
    private Long id;
    private int quantite;
    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;
    @ManyToOne
    @JoinColumn(name = "sachet_id")
    private Sachet sachet;
}
