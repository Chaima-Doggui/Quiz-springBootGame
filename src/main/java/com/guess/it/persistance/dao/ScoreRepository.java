package com.guess.it.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guess.it.persistance.entities.Score;

public interface ScoreRepository extends JpaRepository<Score,Integer > {

}
