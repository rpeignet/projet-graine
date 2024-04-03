package fr.projetgraine.service;

import fr.projetgraine.business.Commande;

import java.util.List;

public interface CommandeService {
    List<Commande> findAllSortedByTotalAmount();
}
