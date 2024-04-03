package fr.projetgraine.business;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Commande {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime dateHeureDEnvoi;

    @NotNull
    @Size(min = 1, message = "La commande doit avoir au moins une ligne de commande")
    @OneToMany(mappedBy = "commande")
    private List<LigneCommande> lignesCommande;
    @ManyToOne
    @JoinColumn(name = "jardinier_id")
    private Jardinier jardinier;

    public List<LigneCommande> getLignesCommande() {
        return lignesCommande;
    }
}
