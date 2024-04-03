package fr.projetgraine.service;

import fr.projetgraine.business.Sachet;

import java.util.List;

public interface SachetService {
    List<Sachet> findSachetsOrderedByQuantiteCommandee();
}
