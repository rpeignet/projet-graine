package fr.projetgraine.service.impl;

import fr.projetgraine.business.Recette;
import fr.projetgraine.repository.RecetteRepository;
import fr.projetgraine.service.RecetteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecetteServiceImpl implements RecetteService {

    private final RecetteRepository recetteRepository;

    @Autowired
    public RecetteServiceImpl(RecetteRepository recetteRepository) {
        this.recetteRepository = recetteRepository;
    }

    @Override
    public List<Recette> findRecettesSortedByTypeDeGraineCount() {
        return recetteRepository.findRecettesSortedByTypeDeGraineCount();
    }
}
