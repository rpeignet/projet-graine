package fr.projetgraine.service.impl;

import fr.projetgraine.business.Fournisseur;
import fr.projetgraine.repository.FournisseurRepository;
import fr.projetgraine.service.FournisseurService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FournisseurServiceImpl implements FournisseurService {
    private FournisseurRepository fournisseurRepository;

    @Override
    public Fournisseur findById(Long id) {
        return fournisseurRepository.findById(id).orElseThrow();
    }
}
