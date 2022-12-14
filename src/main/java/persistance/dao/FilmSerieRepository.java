package persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import persistance.entities.FilmSerie;

public interface FilmSerieRepository extends JpaRepository<FilmSerie, String> {

}
