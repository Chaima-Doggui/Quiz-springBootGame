package services.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import persistance.dao.UtilisateurRepository;
import persistance.entities.Utilisateur;
import services.interfaces.UtilisateurServiceInterface;

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

}
