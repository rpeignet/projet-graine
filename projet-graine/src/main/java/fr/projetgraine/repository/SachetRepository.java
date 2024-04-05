package fr.projetgraine.repository;

import fr.projetgraine.business.Sachet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SachetRepository extends JpaRepository<Sachet, Long> {
    @Query("SELECT s FROM Sachet s WHERE s.lignesCommande IS EMPTY")
    List<Sachet> findSachetsNeverOrdered();

    @Query("""
            FROM Sachet s
            JOIN s.lignesCommande lc
            ORDER BY sum(lc.quantite) DESC
            """)
    List<Sachet> findSachetsOrderedByQuantiteCommandeeDesc();

    @Query("select s from Sachet s where s.lignesCommande is empty")
    List<Sachet> findByLigneCommandesEmpty();
}