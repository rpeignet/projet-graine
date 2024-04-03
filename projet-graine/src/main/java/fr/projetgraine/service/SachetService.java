package fr.projetgraine.service;

import fr.projetgraine.business.Sachet;
import fr.projetgraine.business.TypeDeGraine;

import java.util.List;

public interface SachetService {
    public List<Sachet> findAll();
    public boolean addSachet(Sachet sachet);
    public boolean deleteSachet(Sachet sachet);
}
