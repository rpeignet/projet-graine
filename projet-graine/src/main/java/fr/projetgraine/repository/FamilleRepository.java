package fr.projetgraine.repository;

import fr.projetgraine.business.Famille;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilleRepository extends JpaRepository<Famille, Long> {
}
