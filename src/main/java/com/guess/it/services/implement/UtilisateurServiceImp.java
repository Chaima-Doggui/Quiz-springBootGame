package com.guess.it.services.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guess.it.persistance.dao.UtilisateurRepository;
import com.guess.it.persistance.entities.Utilisateur;
import com.guess.it.services.interfaces.UtilisateurServiceInterface;

@Service
public class UtilisateurServiceImp implements UtilisateurServiceInterface {
	
	
	@Autowired
	UtilisateurRepository UtilisateurRepository;
	
	
	@Override
	public Utilisateur saveUtilisateur(Utilisateur u) {
		// TODO Auto-generated method stub
		return UtilisateurRepository.save(u);
	}

	@Override
	public Utilisateur updateUtilisateur(Utilisateur u) {
		// TODO Auto-generated method stub
		return UtilisateurRepository.saveAndFlush(u);
	}

	@Override
	public void deleteUtilisateur(Utilisateur u) {
		UtilisateurRepository.delete(u);

	}

	@Override
	public void deleteUtilisateurById(Integer id) {
		UtilisateurRepository.deleteById(id);

	}

	@Override
	public Utilisateur getUtilisateur(Integer id) {
		// TODO Auto-generated method stub
		return UtilisateurRepository.findById(id).get();
	}

	@Override
	public List<Utilisateur> getAllUtilisateurs() {
		// TODO Auto-generated method stub
		return UtilisateurRepository.findAll();

	}

	@Override
	public Utilisateur getUserByLM(String login, String mdp) {
		// TODO Auto-generated method stub
		return UtilisateurRepository.getUserByLM(login, mdp);
	}

}
