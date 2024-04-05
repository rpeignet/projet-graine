package fr.projetgraine.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NbCommandesParMois {
    private int annee;
    private int mois;
    private long nombreDeCommandes;
}
