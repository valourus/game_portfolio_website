package com.valourus.portfolio.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.valourus.portfolio.models.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

}