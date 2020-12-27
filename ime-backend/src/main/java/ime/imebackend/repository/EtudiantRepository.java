package ime.imebackend.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import ime.imebackend.entity.Etudiant;
import ime.imebackend.entity.user;
import lombok.NonNull;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
	/*
	 * @RestResource(path = "email") Page<Etudiant> findByEmail(@Param("email")
	 * String email, Pageable pageable);
	 */
	
	public List<Etudiant> findByEtatinscriptionIs(int etat);
}
