package fr.projetgraine.service.impl;

import fr.projetgraine.business.Sachet;
import fr.projetgraine.repository.SachetRepository;
import fr.projetgraine.service.SachetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SachetServiceImpl implements SachetService {

    private final SachetRepository sachetRepository;

    @Autowired
    public SachetServiceImpl(SachetRepository sachetRepository) {
        this.sachetRepository = sachetRepository;
    }

    @Override
    public List<Sachet> findAll() {
        return null;
    }

    @Override
    public boolean addSachet(Sachet sachet) {
        return false;
    }

    @Override
    public boolean deleteSachet(Sachet sachet) {
        return sachetRepository.;
    }

    @Override
    public List<Sachet> findSachetsOrderedByQuantiteCommandee() {
        return sachetRepository.findSachetsOrderedByQuantiteCommandeeDesc();
    }
}