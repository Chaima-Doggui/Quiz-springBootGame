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
import com.guess.it.persistance.entities.Score;
import com.guess.it.services.interfaces.ActeurServiceInterface;
import com.guess.it.services.interfaces.ScoreServiceInterface;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/scores")
public class ScoreController {

    @Autowired
    ScoreServiceInterface ScoreService ;

    @RequestMapping(value="/ajouterScore", method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    Score save(@RequestBody Score score) {
    	System.out.println("**save **");
        Score s=ScoreService.saveScore(score);
        System.out.println("**"+s.getValeur()+s.getDate());
        return s ;
    }

    @GetMapping("/scores")
    List<Score> Scores() {
        return ScoreService.getAllScores();}

    @DeleteMapping("/deleteById/{id}")
    boolean deleteById(@PathVariable Integer id) {
        ScoreService.deleteScoreById(id);
        return true;
    }



}