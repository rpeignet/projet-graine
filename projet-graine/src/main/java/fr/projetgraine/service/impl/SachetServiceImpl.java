package fr.projetgraine.service.impl;

import fr.projetgraine.DTO.SachetDTO;
import fr.projetgraine.business.Fournisseur;
import fr.projetgraine.business.Sachet;
import fr.projetgraine.business.TypeDeGraine;
import fr.projetgraine.business.Utilisateur;
import fr.projetgraine.repository.SachetRepository;
import fr.projetgraine.repository.UtilisateurRepository;
import fr.projetgraine.service.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SachetServiceImpl implements SachetService {

    private SachetRepository sachetRepository;
    private TypeDeGraineService typeDeGraineService;
    private FournisseurService fournisseurService;

    @Override
    public List<Sachet> findAll() {
        return sachetRepository.findAll();
    }

    @Override
    public void insertSachet(SachetDTO sachetDTO) {
        TypeDeGraine typeDeGraine = typeDeGraineService.findById(Long.valueOf(sachetDTO.idTypeDeGraine));
        // Fournisseur_id à changer (passer l'ID du Fournisseur connecté)
        Fournisseur fournisseur = fournisseurService.findById(2L);
        Sachet sachet = new Sachet(sachetDTO.poidsEnGrammes, sachetDTO.prixEnEuros, typeDeGraine, fournisseur);
        sachetRepository.save(sachet);
    }

    @Override
    public void deleteSachetById(Long idSachet) {
        sachetRepository.deleteById(idSachet);
    }

    @Override
    public List<Sachet> findSachetsOrderedByQuantiteCommandee() {
        return sachetRepository.findSachetsOrderedByQuantiteCommandeeDesc();
    }
}