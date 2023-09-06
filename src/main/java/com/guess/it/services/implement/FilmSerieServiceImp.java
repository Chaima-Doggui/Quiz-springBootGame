package com.guess.it.services.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guess.it.persistance.dao.FilmSerieRepository;
import com.guess.it.persistance.entities.FilmSerie;
import com.guess.it.services.interfaces.FilmSerieServiceInterface;

@Service
public class FilmSerieServiceImp implements FilmSerieServiceInterface {
	
	
	@Autowired
	FilmSerieRepository FilmSerieRepository;
	
	@Override
	public FilmSerie saveFilmSerie(FilmSerie f) {
		// TODO Auto-generated method stub
		return FilmSerieRepository.save(f);
	}

	@Override
	public FilmSerie updateFilmSerie(FilmSerie f) {
		// TODO Auto-generated method stub
		return FilmSerieRepository.saveAndFlush(f);
	}

	@Override
	public void deleteFilmSerie(FilmSerie f) {
		// TODO Auto-generated method stub
		FilmSerieRepository.delete(f);

	}

	@Override
	public void deleteFilmSerieById(String id) {
		FilmSerieRepository.deleteById(id);

	}

	@Override
	public FilmSerie getFilmSerie(String id) {
		// TODO Auto-generated method stub
		return FilmSerieRepository.findById(id).get();
	}

	@Override
	public List<FilmSerie> getAllFilmSeries() {
		// TODO Auto-generated method stub
		return FilmSerieRepository.findAll();
	}

	public List<FilmSerie> FilmsByActeur(String idActeur) {
        // TODO Auto-generated method stub
        return FilmSerieRepository.FilmsByActeur(idActeur);
	}
}
