package fr.projetgraine.service;

import fr.projetgraine.business.TypeDeGraine;

import java.util.List;

public interface TypeDeGraineService {
    public List<TypeDeGraine> findAll();
    public List<TypeDeGraine> findByIdFamille(Long idFamille);
}

