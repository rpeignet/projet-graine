package fr.projetgraine.service.impl;

import fr.projetgraine.business.TypeDeGraine;
import fr.projetgraine.repository.TypeDeGraineRepository;
import fr.projetgraine.service.TypeDeGraineService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.IsoFields;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<TypeDeGraine> findPlantableSeeds() {
        int currentWeek = LocalDate.now().get(IsoFields.WEEK_OF_WEEK_BASED_YEAR);
        List<TypeDeGraine> allSeeds = typeDeGraineRepository.findAll();
        return allSeeds.stream()
                .filter(seed -> seed.getSemaineDePlantationMin() <= currentWeek && seed.getSemaineDePlantationMax() >= currentWeek)
                .collect(Collectors.toList());
    }

    @Override
    public List<TypeDeGraine> findPlantableSeedsForCurrentWeek() {
        int currentWeek = LocalDate.now().get(IsoFields.WEEK_OF_WEEK_BASED_YEAR);
        return typeDeGraineRepository.findPlantableSeedsForWeek(currentWeek);
    }
}
