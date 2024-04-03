package fr.projetgraine.service.impl;

import fr.projetgraine.business.Famille;
import fr.projetgraine.repository.FamilleRepository;
import fr.projetgraine.service.FamilleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FamilleServiceImpl implements FamilleService {
    private FamilleRepository familleRepository;

    @Override
    public List<Famille> findAll() {
        return familleRepository.findAll();
    }
}
