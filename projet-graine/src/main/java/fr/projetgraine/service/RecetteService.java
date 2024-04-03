package fr.projetgraine.service;

import fr.projetgraine.business.Recette;

import java.util.List;

public interface RecetteService {
    List<Recette> findRecettesSortedByTypeDeGraineCount();
}
