package persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import persistance.entities.Score;

public interface ScoreRepository extends JpaRepository<Score,Integer > {

}
