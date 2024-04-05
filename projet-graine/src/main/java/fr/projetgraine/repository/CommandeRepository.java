package fr.projetgraine.repository;

import fr.projetgraine.business.Commande;
import fr.projetgraine.util.NbCommandesParMois;
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

    List<Commande> findByDateHeureDEnvoiBetween(LocalDateTime dateHeureDEnvoiStart, LocalDateTime dateHeureDEnvoiEnd);

    @Query("""
                FROM Commande c
                JOIN c.lignesCommande lc
                JOIN lc.sachet s
                ORDER BY s.prixEnEuros * lc.quantite DESC
                """)
    List<Commande> findAllOrderByTotalAmount();

    // Ceci est une projection (qui se caractérise par SELECT new)
    // Chaque ligne de résultat va servir à hydrater un nouvel objet de type NbCommandesParMois
    // Le constructeur appelé après le mot-clé new est le constructeur avec tous les paramètres
    @Query("""
            SELECT new fr.esgi.graines.util.NbCommandesParMois(YEAR(c.dateHeureDEnvoi), MONTH(c.dateHeureDEnvoi), count(*) AS nbCommandes)
            FROM Commande c
            GROUP BY YEAR(c.dateHeureDEnvoi), MONTH(c.dateHeureDEnvoi)
            """)
    List<NbCommandesParMois> findNbOfOrdersPerMonth();

}