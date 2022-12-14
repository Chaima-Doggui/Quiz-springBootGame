package services.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import persistance.dao.FilmSerieRepository;
import persistance.entities.FilmSerie;
import services.interfaces.FilmSerieServiceInterface;

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

}
