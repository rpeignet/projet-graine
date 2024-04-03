package fr.projetgraine.repository;

import fr.projetgraine.business.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
    @Query("SELECT c FROM Commande c WHERE c.dateHeureDEnvoi BETWEEN :start AND :end")
    List<Commande> findCommandesBetweenDates(LocalDateTime start, LocalDateTime end);
    @Query("SELECT EXTRACT(MONTH FROM c.dateHeureDEnvoi) AS month, COUNT(c) FROM Commande c GROUP BY EXTRACT(MONTH FROM c.dateHeureDEnvoi)")
    List<Object[]> countCommandesByMonth();

    @Query("SELECT c FROM Commande c JOIN FETCH c.lignesCommande")
    List<Commande> findAllWithLignesCommande();
}