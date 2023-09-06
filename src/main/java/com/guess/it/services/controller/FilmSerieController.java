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

import com.guess.it.persistance.entities.FilmSerie;
import com.guess.it.services.interfaces.FilmSerieServiceInterface;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/filmSerie")
public class FilmSerieController {

    @Autowired
    FilmSerieServiceInterface FilmService ;

    @RequestMapping(value="/ajouterFilm", method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    FilmSerie save(@RequestBody FilmSerie film) {
          System.out.println("save ");
          FilmSerie f=FilmService.saveFilmSerie(film);
          System.out.println("**"+f.getNom());
        return f ;
    }

    @GetMapping("/films")
   public List<FilmSerie> Acteurs() {
        return FilmService.getAllFilmSeries();
   }

    @DeleteMapping("/deleteById/{id}")
    boolean deleteById(@PathVariable String id) {
        FilmService.deleteFilmSerieById(id);
        return true;
    }
}