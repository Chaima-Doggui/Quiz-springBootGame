package com.guess.it.persistance.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.guess.it.persistance.entities.FilmSerie;

public interface FilmSerieRepository extends JpaRepository<FilmSerie, String> {
	@Query(value = "select * from 'j2eedb'.'films_series' fs,'j2eedb'.'role' r,'j2eedb'.'acteurs' a where r.id_acteur= :idActeur and r.id_acteur=a.id and fs.id=r.id_film",nativeQuery = true)
    List<FilmSerie> FilmsByActeur(@Param("idActeur") String idActeur );
}
