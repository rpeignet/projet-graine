package fr.projetgraine.service.impl;

import fr.projetgraine.business.Jardinier;
import fr.projetgraine.repository.JardinierRepository;
import fr.projetgraine.service.JardinierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class JardinierServiceImpl implements JardinierService {

    private final JardinierRepository jardinierRepository;

    @Autowired
    public JardinierServiceImpl(JardinierRepository jardinierRepository) {
        this.jardinierRepository = jardinierRepository;
    }

    @Override
    public List<Jardinier> findJardiniersSortedByCommandeCountDesc() {
        return jardinierRepository.findJardiniersSortedByCommandeCountDesc();
    }

    @Override
    public List<Jardinier> findJardiniersOlderThan60() {
        LocalDate sixtyYearsAgo = LocalDate.now().minusYears(60);
        return jardinierRepository.findJardiniersOlderThan(sixtyYearsAgo);
    }
}