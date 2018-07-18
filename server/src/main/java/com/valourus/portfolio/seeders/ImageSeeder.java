package com.valourus.portfolio.seeders;

import com.github.javafaker.Faker;
import com.valourus.portfolio.dbmodels.Image;
import com.valourus.portfolio.repos.GameRepository;
import com.valourus.portfolio.repos.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class ImageSeeder implements TableSeeder {

    @Autowired
    private ImageRepository imageRepository;
    @Autowired
    private GameRepository gameRepository;

    @Override
    public void seed(Faker faker) {
        for(int i = 0;i < Seeder.AMOUNT_OF_GAMES;i++) {
            for(int y = 0;y < Seeder.IMAGES_PER_GAME;y++) {
                Image image = new Image();
                image.setGame(gameRepository.getOne(i+1));
                //TODO: implement image seed as Blob
                imageRepository.save(image);
            }
        }
    }
}
