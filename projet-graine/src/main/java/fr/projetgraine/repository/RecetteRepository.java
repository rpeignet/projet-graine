package fr.projetgraine.repository;

import fr.projetgraine.business.Recette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecetteRepository extends JpaRepository<Recette, Long> {
    @Query("SELECT r FROM Recette r JOIN r.typeDeGraines t GROUP BY r ORDER BY COUNT(t) DESC")
    List<Recette> findRecettesSortedByTypeDeGraineCount();
}
