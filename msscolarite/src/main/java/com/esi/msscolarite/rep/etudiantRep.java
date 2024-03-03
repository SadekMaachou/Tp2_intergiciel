package com.esi.msscolarite.rep;


import com.esi.msscolarite.entities.etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface etudiantRep extends JpaRepository<etudiant,Long> {
}

