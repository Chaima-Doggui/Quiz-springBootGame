package services.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import persistance.dao.ScoreRepository;
import persistance.entities.Score;
import services.interfaces.ScoreServiceInterface;

public class ScoreServiceImp implements ScoreServiceInterface {


	@Autowired
	ScoreRepository ScoreRepository;

	@Override
	public Score saveScore(Score s) {
		// TODO Auto-generated method stub
		return ScoreRepository.save(s);
	}

	@Override
	public Score updateScore(Score s) {
		// TODO Auto-generated method stub
		return ScoreRepository.saveAndFlush(s);
	}

	@Override
	public void deleteScore(Score s) {
		ScoreRepository.delete(s);

	}

	@Override
	public void deleteScoreById(Integer id) {
		ScoreRepository.deleteById(id);

	}

	@Override
	public Score getScore(Integer id) {
		// TODO Auto-generated method stub
		return ScoreRepository.findById(id).get();
	}

	@Override
	public List<Score> getAllScores() {
		// TODO Auto-generated method stub
		return ScoreRepository.findAll();
	}

}
