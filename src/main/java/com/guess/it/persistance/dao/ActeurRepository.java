package com.guess.it.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guess.it.persistance.entities.Acteur;

public interface ActeurRepository extends JpaRepository <Acteur,String> {

}
