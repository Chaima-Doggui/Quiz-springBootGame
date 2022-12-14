package services.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import persistance.dao.ActeurRepository;
import persistance.entities.Acteur;
import services.interfaces.ActeurServiceInterface;

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
