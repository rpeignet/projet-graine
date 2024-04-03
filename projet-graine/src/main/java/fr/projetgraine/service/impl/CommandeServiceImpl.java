package fr.projetgraine.service.impl;

import fr.projetgraine.business.Commande;
import fr.projetgraine.repository.CommandeRepository;
import fr.projetgraine.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommandeServiceImpl implements CommandeService {

    private final CommandeRepository commandeRepository;

    @Autowired
    public CommandeServiceImpl(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @Override
    public List<Commande> findAllSortedByTotalAmount() {
        List<Commande> allCommandes = commandeRepository.findAllWithLignesCommande();
        return allCommandes.stream()
                .sorted(Comparator.comparingDouble(this::calculateTotalAmountForCommande).reversed())
                .collect(Collectors.toList());
    }

    private double calculateTotalAmountForCommande(Commande commande) {
        return commande.getLignesCommande().stream()
                .mapToDouble(ligne -> ligne.getSachet().getPrixEnEuros() * ligne.getQuantite())
                .sum();
    }
}