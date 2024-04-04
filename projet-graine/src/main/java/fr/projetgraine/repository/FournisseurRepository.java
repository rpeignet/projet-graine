package fr.projetgraine.repository;

import fr.projetgraine.business.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {
}
