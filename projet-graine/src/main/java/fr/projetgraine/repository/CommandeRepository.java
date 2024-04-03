package fr.projetgraine.repository;

import fr.projetgraine.business.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
    List<Commande> findAllByDateHeureDEnvoiBetween(LocalDateTime debut, LocalDateTime fin);

    @Query("SELECT FUNCTION('MONTH', c.dateHeureDEnvoi) AS month, COUNT(c) FROM Commande c GROUP BY month ORDER BY month")
    List<Object[]> countCommandesByMonth();

    //Le calcul du montant total et le tri seront effectués dans le service
    @Query("SELECT c FROM Commande c JOIN FETCH c.lignesCommande")
    List<Commande> findAllWithLignesCommande();

}