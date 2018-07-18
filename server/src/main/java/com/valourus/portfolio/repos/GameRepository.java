package com.valourus.portfolio.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.valourus.portfolio.dbmodels.GameData;

@Repository
public interface GameRepository extends JpaRepository<GameData, Integer> {

}