package fr.projetgraine.service;

import fr.projetgraine.business.Recette;
import fr.projetgraine.business.TypeDeGraine;

import java.util.List;

public interface RecetteService {
    List<Recette> findRecettesSortedByTypeDeGraineCount();

    List<TypeDeGraine> findGrainesById(Long id);
    List<Recette> findAll();
}
