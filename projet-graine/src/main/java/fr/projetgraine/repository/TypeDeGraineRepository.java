package fr.projetgraine.repository;

import fr.projetgraine.business.TypeDeGraine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TypeDeGraineRepository extends JpaRepository<TypeDeGraine, Long> {

    @Query("SELECT t FROM TypeDeGraine t WHERE :currentWeek BETWEEN t.semaineDePlantationMin AND t.semaineDePlantationMax")
    List<TypeDeGraine> findPlantableSeedsForWeek(int currentWeek);
    @Query("SELECT t FROM TypeDeGraine t WHERE t.famille.id = :idFamille")
    public List<TypeDeGraine> findByIdFamille(Long idFamille);
}
