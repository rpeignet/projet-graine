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

    @Query("SELECT j FROM Jardinier j WHERE j.dateDeNaissance <= :cutoff")
    List<Jardinier> findJardiniersOlderThanSixty(LocalDate cutoff);
    // La il faut qu'on calcule cutoff dans le service ou le controleur avant d'appeler laméthode, en soustrayant 60 ans à la date actuelle
}