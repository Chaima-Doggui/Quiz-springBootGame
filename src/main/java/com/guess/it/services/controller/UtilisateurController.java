package com.guess.it.services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guess.it.persistance.entities.Utilisateur;
import com.guess.it.services.interfaces.UtilisateurServiceInterface;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class UtilisateurController {
	@Autowired
	UtilisateurServiceInterface UserService ;
	
	@RequestMapping(value="/ajouterUtilisateur", method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    Utilisateur save(@RequestBody Utilisateur utilisateur) {	
		  System.out.println("*******save ***********");
		  Utilisateur u=UserService.saveUtilisateur(utilisateur);
		  System.out.println("*******"+u.getNom()+u.getId());
        return u ;
    }
	
	@GetMapping("/getUtilisateurById/{id}")
    Utilisateur getUtilisateurById(@PathVariable Integer id) {
        return UserService.getUtilisateur(id);
    }
	
	@GetMapping("/login/{login}/{mdp}")
	 ResponseEntity<?> getUserByLM(@PathVariable String login,@PathVariable String mdp) {
		Utilisateur u = UserService.getUserByLM(login, mdp);
		if(u == null)
			return new ResponseEntity<>(u, HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<>(u, HttpStatus.OK);
    }
	
	@DeleteMapping("/deleteById/{id}")
    boolean deleteById(@PathVariable Integer id) {
        UserService.deleteUtilisateurById(id);
        return true;
    }
	
	

}

