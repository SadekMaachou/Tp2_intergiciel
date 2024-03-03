package com.esi.msscolarite.entities;

import com.esi.msformation.entities.formation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    @Column(nullable = false)
    private String nom;


    @ManyToOne
    @JoinColumn(name = "idEtablissement")
    private etablissement Etablissement;

    private Long idFormation;
    @Transient
    private formation Formation;

}
