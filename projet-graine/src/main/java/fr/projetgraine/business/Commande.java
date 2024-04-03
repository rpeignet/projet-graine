package fr.projetgraine.business;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Commande {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime dateHeureDEnvoi;
    @OneToMany(mappedBy = "commande")
    private List<LigneCommande> lignesCommande;
    @ManyToOne
    @JoinColumn(name = "jardinier_id")
    private Jardinier jardinier;

}
