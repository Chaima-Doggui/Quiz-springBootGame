package services.interfaces;

import java.util.List;

import persistance.entities.FilmSerie;

public interface FilmSerieServiceInterface {
	FilmSerie saveFilmSerie(FilmSerie f);

	FilmSerie updateFilmSerie(FilmSerie f);

	void deleteFilmSerie(FilmSerie f);

	void deleteFilmSerieById(String id);

	FilmSerie getFilmSerie(String id);

	List<FilmSerie> getAllFilmSeries();

}
