package com.esi.msscolarite.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class etablissement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtablissement;
    @Column(nullable = false)
    private String nom;

    @JsonIgnore
    @ToString.Exclude

    @OneToMany(mappedBy = "Etablissement")
    private List<etudiant> lesEtudiants;

}
