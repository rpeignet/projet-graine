package fr.projetgraine.repository;

import fr.projetgraine.business.Jardinier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface JardinierRepository extends JpaRepository<Jardinier, Long> {
    @Query("""
            SELECT c.jardinier
            FROM Commande c, LigneCommande lc
            where lc.commande=c AND lc.sachet.typeDeGraine.nom='Basilic'
            """)
    List<Jardinier> findJardiniersWhoOrderedBasil();

    @Query("SELECT j FROM Jardinier j LEFT JOIN j.commandes c GROUP BY j ORDER BY COUNT(c) DESC")
    List<Jardinier> findJardiniersSortedByCommandeCountDesc();

    @Query("""
            FROM Jardinier j
            ORDER BY size(j.commandes) DESC
            """)
    List<Jardinier> findJardinierRankedByOrders();

    @Query("SELECT j FROM Jardinier j WHERE j.dateDeNaissance <= :cutoff")
    List<Jardinier> findJardiniersOlderThan(LocalDate cutoff);

    @Query("""
            FROM Jardinier j
            WHERE year(j.dateDeNaissance) < (year(current date) - 60)
            """)
    List<Jardinier> findJardiniersOlderThan60();
}