package com.esi.msformation.rep;

import com.esi.msformation.entities.formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface formationRep extends JpaRepository<formation,Long> {
}

