package fr.projetgraine.service.impl;

import fr.projetgraine.business.TypeDeGraine;
import fr.projetgraine.repository.TypeDeGraineRepository;
import fr.projetgraine.service.TypeDeGraineService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TypeDeGraineServiceImpl implements TypeDeGraineService {
    private TypeDeGraineRepository typeDeGraineRepository;

    @Override
    public List<TypeDeGraine> findAll() {
        return typeDeGraineRepository.findAll();
    }

    @Override
    public List<TypeDeGraine> findByIdFamille(Long idFamille) {
        return typeDeGraineRepository.findByIdFamille(idFamille);
    }
}
