package fr.projetgraine.service.impl;

import fr.projetgraine.business.Utilisateur;
import fr.projetgraine.repository.UtilisateurRepository;
import fr.projetgraine.service.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService {
    private UtilisateurRepository utilisateurRepository;
    @Override
    public Utilisateur findById(Long id) {
        return utilisateurRepository.findById(id).orElseThrow();
    }
}