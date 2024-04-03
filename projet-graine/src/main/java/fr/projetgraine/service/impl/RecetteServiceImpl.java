package fr.projetgraine.service.impl;

import fr.projetgraine.business.Recette;
import fr.projetgraine.business.TypeDeGraine;
import fr.projetgraine.repository.RecetteRepository;
import fr.projetgraine.service.RecetteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RecetteServiceImpl implements RecetteService {

    private RecetteRepository recetteRepository;

    @Override
    public List<Recette> findRecettesSortedByTypeDeGraineCount() {
        return recetteRepository.findRecettesSortedByTypeDeGraineCount();
    }

    @Override
    public List<TypeDeGraine> findGrainesById(Long id) {
        Recette recette = recetteRepository.findById(id).orElseThrow();
        return recette.getTypeDeGraines();
    }

    @Override
    public List<Recette> findAll() {
        return recetteRepository.findAll();
    }
}
