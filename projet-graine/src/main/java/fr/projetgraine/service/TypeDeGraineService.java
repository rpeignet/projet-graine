package fr.projetgraine.service;

import fr.projetgraine.business.TypeDeGraine;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TypeDeGraineService {
    public List<TypeDeGraine> findAll();
    public List<TypeDeGraine> findByIdFamille(Long idFamille);
}
