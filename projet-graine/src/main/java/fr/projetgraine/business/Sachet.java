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

    @OneToMany(mappedBy = "sachet")
    private List<LigneCommande> lignesCommande;
    @ManyToOne
    private Fournisseur fournisseur;

    public float getPrixEnEuros() {
        return prixEnEuros;
    }
}
