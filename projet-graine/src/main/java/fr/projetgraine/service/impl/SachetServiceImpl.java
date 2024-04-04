package fr.projetgraine.service.impl;

import fr.projetgraine.DTO.SachetDTO;
import fr.projetgraine.business.Fournisseur;
import fr.projetgraine.business.Sachet;
import fr.projetgraine.business.TypeDeGraine;
import fr.projetgraine.business.Utilisateur;
import fr.projetgraine.repository.SachetRepository;
import fr.projetgraine.repository.UtilisateurRepository;
import fr.projetgraine.service.SachetService;
import fr.projetgraine.service.TypeDeGraineService;
import fr.projetgraine.service.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SachetServiceImpl implements SachetService {

    private SachetRepository sachetRepository;
    private TypeDeGraineService typeDeGraineService;
    private UtilisateurService utilisateurService;

    @Override
    public List<Sachet> findAll() {
        return sachetRepository.findAll();
    }

    @Override
    public void insertSachet(SachetDTO sachetDTO) {
        // Fournisseur_id à changer (passer l'ID du Fournisseur connecté)
        TypeDeGraine typeDeGraine = typeDeGraineService.findById(Long.valueOf(sachetDTO.idTypeDeGraine));
        Utilisateur utilisateur = utilisateurService.findById(2L);
        Sachet sachet = new Sachet(sachetDTO.poidsEnGrammes, sachetDTO.prixEnEuros, typeDeGraine, (Fournisseur) utilisateur);
        sachetRepository.save(sachet);
    }

    @Override
    public void deleteSachetById(Long idSachet) {
        sachetRepository.deleteSachetById(idSachet);
    }

    @Override
    public List<Sachet> findSachetsOrderedByQuantiteCommandee() {
        return sachetRepository.findSachetsOrderedByQuantiteCommandeeDesc();
    }
}