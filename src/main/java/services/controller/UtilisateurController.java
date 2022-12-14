package services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import persistance.entities.Utilisateur;
import services.interfaces.UtilisateurServiceInterface;

@RestController
@RequestMapping("/api/utilisateur")
public class UtilisateurController {
	@Autowired
	UtilisateurServiceInterface UserService ;
	
	@PostMapping("/ajouterUtilisateur")
	@RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
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
	
	@GetMapping("/login/{login , mdp }")
    Utilisateur getUserByLM(@PathVariable String login,@PathVariable String mdp) {
        return UserService.getUserByLM(login, mdp);
    }
	
	@DeleteMapping("/deleteById/{id}")
    boolean deleteById(@PathVariable Integer id) {
        UserService.deleteUtilisateurById(id);
        return true;
    }
	
	

}
