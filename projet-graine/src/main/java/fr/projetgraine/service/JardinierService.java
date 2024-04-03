package fr.projetgraine.service;

import fr.projetgraine.business.Jardinier;

import java.util.List;

public interface JardinierService {
    List<Jardinier> findJardiniersSortedByCommandeCountDesc();

    List<Jardinier> findJardiniersOlderThan60();
}
