package fr.projetgraine.repository;

import fr.projetgraine.business.Jardinier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface JardinierRepository extends JpaRepository<Jardinier, Long> {
    @Query("SELECT distinct j FROM Jardinier j JOIN j.commandes c JOIN c.lignesCommande lc JOIN lc.sachet s JOIN s.typeDeGraine t WHERE t.nom = 'Basilic'")
    List<Jardinier> findJardiniersWhoOrderedBasil();

    @Query("SELECT j FROM Jardinier j LEFT JOIN j.commandes c GROUP BY j ORDER BY COUNT(c) DESC")
    List<Jardinier> findJardiniersSortedByCommandeCountDesc();

    @Query("SELECT j FROM Jardinier j WHERE j.dateDeNaissance <= :cutoff")
    List<Jardinier> findJardiniersOlderThan(LocalDate cutoff);
}