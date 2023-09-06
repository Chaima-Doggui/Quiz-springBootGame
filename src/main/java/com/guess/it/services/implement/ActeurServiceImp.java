package com.guess.it.services.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guess.it.persistance.dao.ActeurRepository;
import com.guess.it.persistance.entities.Acteur;
import com.guess.it.services.interfaces.ActeurServiceInterface;

@Service
public class ActeurServiceImp implements ActeurServiceInterface {
	
	
	@Autowired
	ActeurRepository ActeurRepository;
	
	
	@Override
	public Acteur saveActeur(Acteur a) {
		// TODO Auto-generated method stub
		return ActeurRepository.save(a);
	}

	@Override
	public Acteur updateActeur(Acteur a) {
		// TODO Auto-generated method stub
		return ActeurRepository.saveAndFlush(a);
	}

	@Override
	public void deleteActeur(Acteur a) {
		ActeurRepository.delete(a);
	}

	@Override
	public void deleteActeurById(String id) {
		ActeurRepository.deleteById(id);
	}

	@Override
	public Acteur getActeur(String id) {
		
		return ActeurRepository.findById(id).get();
	}

	@Override
	public List<Acteur> getAllActeurs() {
		// TODO Auto-generated method stub
		return ActeurRepository.findAll() ;
	}

}
