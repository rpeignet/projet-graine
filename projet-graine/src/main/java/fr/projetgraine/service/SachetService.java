package fr.projetgraine.service;

import fr.projetgraine.DTO.SachetDTO;
import fr.projetgraine.business.Sachet;
import java.util.List;

public interface SachetService {
    public List<Sachet> findAll();
    public void deleteById(Long idSachet);
    public void insertSachet(SachetDTO sachetDTO);
    public List<Sachet> findSachetsOrderedByQuantiteCommandee();
}
