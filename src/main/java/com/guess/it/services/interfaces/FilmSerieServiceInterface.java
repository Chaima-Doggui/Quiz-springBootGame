package com.guess.it.services.interfaces;

import java.util.List;

import com.guess.it.persistance.entities.FilmSerie;

public interface FilmSerieServiceInterface {
	FilmSerie saveFilmSerie(FilmSerie f);

	FilmSerie updateFilmSerie(FilmSerie f);

	void deleteFilmSerie(FilmSerie f);

	void deleteFilmSerieById(String id);

	FilmSerie getFilmSerie(String id);

	List<FilmSerie> getAllFilmSeries();

	List<FilmSerie>  FilmsByActeur(String idActeur );
}
