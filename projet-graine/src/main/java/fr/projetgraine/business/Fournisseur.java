package fr.projetgraine.business;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Pattern;

import java.util.List;

@Entity
public class Fournisseur extends Utilisateur {
    @Pattern(regexp = "^0[67][0-9]{8}$", message = "Le numéro de téléphone doit débuter par 06 ou 07 et contenir 10 chiffres")
    private String numeroPortable;
    @OneToMany
    private List<Sachet> sachets;
}
