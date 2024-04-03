package fr.projetgraine.repository;

import fr.projetgraine.business.Jardinier;
import fr.projetgraine.business.Sachet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface SachetRepository extends JpaRepository<Sachet, Long> {
    @Query("SELECT s FROM Sachet s WHERE s.lignesCommande IS EMPTY")
    List<Sachet> findSachetsNeverOrdered();

    @Query("SELECT s FROM Sachet s JOIN s.lignesCommande lc GROUP BY s ORDER BY SUM(lc.quantite) DESC")
    List<Sachet> findSachetsOrderedByQuantiteCommandeeDesc();
}