package com.esi.msscolarite.rep;

import com.esi.msscolarite.entities.etablissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface etablissementRep extends JpaRepository<etablissement,Long> {
}

