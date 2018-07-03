package com.valourus.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.valourus.portfolio.models.Game;
import com.valourus.portfolio.repos.GameRepository;

import java.util.List;
@RestController
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping("/")
    List<Game> getGamePages() {
        List<Game> x = gameRepository.findAll();
        return x;
    }
}
