package com.esi.msformation;

import com.esi.msformation.entities.formation;
import com.esi.msformation.rep.formationRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class msformationApplication implements CommandLineRunner {

    @Autowired
    formationRep FormationRep;

    public static void main(String[] args) {
        SpringApplication.run(msformationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        formation f1 = FormationRep.save(new formation(null, "Intergiciel", 20));
        formation f2 = FormationRep.save(new formation(null, "Web", 30));

    }

}
