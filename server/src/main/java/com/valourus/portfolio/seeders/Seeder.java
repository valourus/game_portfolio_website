package com.valourus.portfolio.seeders;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Seeder {

    @Autowired
    private GameSeeder gameSeeder;
    @Autowired
    private ImageSeeder imageSeeder;

    static final int AMOUNT_OF_GAMES = 5;
    static final int IMAGES_PER_GAME = 2;

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Faker faker = new Faker();

        gameSeeder.seed(faker);
        imageSeeder.seed(faker);
    }
}
