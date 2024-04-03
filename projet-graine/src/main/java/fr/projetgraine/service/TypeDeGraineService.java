package fr.projetgraine.service;

import fr.projetgraine.business.TypeDeGraine;
import fr.projetgraine.repository.TypeDeGraineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.IsoFields;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TypeDeGraineService {

    private final TypeDeGraineRepository typeDeGraineRepository;

    @Autowired
    public TypeDeGraineService(TypeDeGraineRepository typeDeGraineRepository) {
        this.typeDeGraineRepository = typeDeGraineRepository;
    }

    public List<TypeDeGraine> findPlantableSeeds() {
        int currentWeek = LocalDate.now().get(IsoFields.WEEK_OF_WEEK_BASED_YEAR);
        List<TypeDeGraine> allSeeds = typeDeGraineRepository.findAll();
        return allSeeds.stream()
                .filter(seed -> seed.getSemaineDePlantationMin() <= currentWeek && seed.getSemaineDePlantationMax() >= currentWeek)
                .collect(Collectors.toList());
    }
}