package com.guess.it.services.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guess.it.persistance.dao.ScoreRepository;
import com.guess.it.persistance.entities.Score;
import com.guess.it.services.interfaces.ScoreServiceInterface;

@Service
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
