package services.interfaces;

import java.util.List;

import persistance.entities.Score;

public interface ScoreServiceInterface {
	
	Score saveScore(Score s);

	Score updateScore(Score s);

	void deleteScore(Score s);

	void deleteScoreById(Integer id);

	Score getScore(Integer id);

	List<Score> getAllScores();

}
