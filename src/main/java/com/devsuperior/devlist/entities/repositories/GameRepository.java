package com.devsuperior.devlist.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.devlist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
