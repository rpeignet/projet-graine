package fr.projetgraine.repository;

import fr.projetgraine.business.TypeDeGraine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeDeGraineRepository extends JpaRepository<TypeDeGraine, Long> {
}