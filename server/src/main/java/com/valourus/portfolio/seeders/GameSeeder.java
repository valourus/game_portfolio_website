package com.valourus.portfolio.seeders;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.valourus.portfolio.dbmodels.GameData;
import com.valourus.portfolio.repos.GameRepository;

@Component
public class GameSeeder implements TableSeeder {

    @Autowired
    private GameRepository gameRepository;

    @Override
    public void seed(Faker faker) {
        for(int i = 0;i < Seeder.AMOUNT_OF_GAMES;i++) {
            GameData gp = new GameData();
            gp.setName( faker.name().fullName() );
            gp.setDescription( faker.lorem().paragraph() );
            gameRepository.save(gp);
        }
    }
}
