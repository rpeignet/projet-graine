package fr.projetgraine.business;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class LigneCommande {
    @Id
    @GeneratedValue
    private Long id;
    @Getter
    private int quantite;
    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;
    @Getter
    @ManyToOne
    @JoinColumn(name = "sachet_id")
    private Sachet sachet;

}
