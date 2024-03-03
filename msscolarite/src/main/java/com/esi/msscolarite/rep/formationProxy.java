package com.esi.msscolarite.rep;

import com.esi.msformation.entities.formation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-formation", url = "localhost:8093")
public interface formationProxy {
    @GetMapping("/formations/{id}")
    public formation getF(@PathVariable("id") Long id);

}
