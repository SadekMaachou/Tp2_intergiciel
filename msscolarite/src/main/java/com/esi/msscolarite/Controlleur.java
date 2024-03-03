package com.esi.msscolarite;

import com.esi.msscolarite.entities.etudiant;
import com.esi.msscolarite.rep.etudiantRep;
import com.esi.msscolarite.rep.formationProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlleur {
    @Autowired
    etudiantRep EtudiantRep;

    @Autowired
    formationProxy fProxy;

    @GetMapping("etudiant/{id}")
    public etudiant getEtudiant(@PathVariable("id") Long id){
        etudiant e = EtudiantRep.findById(id).get();
        e.setFormation(fProxy.getF(e.getIdFormation()));
        return e;
    }

}
