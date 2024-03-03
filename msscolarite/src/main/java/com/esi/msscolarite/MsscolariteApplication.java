package com.esi.msscolarite;

import com.esi.msscolarite.entities.etablissement;
import com.esi.msscolarite.entities.etudiant;
import com.esi.msscolarite.rep.etablissementRep;
import com.esi.msscolarite.rep.etudiantRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.time.LocalDate;

@SpringBootApplication
@EnableFeignClients
public class MsscolariteApplication implements CommandLineRunner{

    @Autowired
    etudiantRep EtudiantRep;
    @Autowired
    etablissementRep EtablissmentRep;


    public static void main(String[] args) {
        SpringApplication.run(MsscolariteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        etablissement et1 = EtablissmentRep.save(new etablissement(null, "ESI", null));
        etablissement et2 = EtablissmentRep.save(new etablissement(null, "USTO", null));
        etudiant e1 = EtudiantRep.save(
                new etudiant(
                        null,
                        "Sadek",
                        et1,
                        1l,
                        null)
        );
        etudiant e2 = EtudiantRep.save(
                new etudiant(
                        null,
                        "Ali",
                        et2,
                        1l,
                        null)
        );
    }

}

