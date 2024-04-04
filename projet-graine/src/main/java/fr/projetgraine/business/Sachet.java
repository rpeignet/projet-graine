package fr.projetgraine.business;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
public class Sachet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int poidsEnGrammes;
    @Getter
    private float prixEnEuros;
    @ManyToOne
    @JoinColumn(name = "typedegraine_id")
    private TypeDeGraine typeDeGraine;

    @OneToMany(mappedBy = "sachet")
    private List<LigneCommande> lignesCommande;
    @ManyToOne
    private Fournisseur fournisseur;

    public Sachet() {
    }

    public Sachet(int poidsEnGrammes, float prixEnEuros, TypeDeGraine typeDeGraine, Fournisseur fournisseur) {
        this.poidsEnGrammes = poidsEnGrammes;
        this.prixEnEuros = prixEnEuros;
        this.typeDeGraine = typeDeGraine;
        this.fournisseur = fournisseur;
    }

    public Long getId() {
        return id;
    }

    public int getPoidsEnGrammes() {
        return poidsEnGrammes;
    }

    public float getPrixEnEuros() {
        return prixEnEuros;
    }

    public TypeDeGraine getTypeDeGraine() {
        return typeDeGraine;
    }
}
