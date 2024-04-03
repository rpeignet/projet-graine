package fr.projetgraine.business;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Fournisseur extends Utilisateur {
    private String numeroPortable;
    @OneToMany
    @JoinColumn(name = "sachet_id")
    private List<Sachet> sachets;
}
