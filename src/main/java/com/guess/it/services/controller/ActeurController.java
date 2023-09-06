package com.guess.it.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guess.it.persistance.entities.Acteur;
import com.guess.it.services.interfaces.ActeurServiceInterface;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/acteurs")
public class ActeurController {

    @Autowired
    ActeurServiceInterface ActeurService;

    @RequestMapping(value="/ajouterActeur", method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    Acteur save(@RequestBody Acteur acteur) {
        Acteur a=ActeurService.saveActeur(acteur);
        return a;
    }

    @GetMapping("/getActeurById/{id}")
    Acteur getActeurById(@PathVariable String id) {
        return ActeurService.getActeur(id);
    }

    @GetMapping("/tousActeurs")
    public List<Acteur> Acteurs() {
         return ActeurService.getAllActeurs();
    }

    @DeleteMapping("/deleteById/{id}")
    boolean deleteById(@PathVariable String id) {
        ActeurService.deleteActeurById(id);
        return true;
    }



}