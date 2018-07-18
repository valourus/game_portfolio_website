package com.valourus.portfolio;

import com.valourus.portfolio.apimodels.GameImpl;
import com.valourus.portfolio.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("api/game")
    List<GameImpl> getGames() {
        return gameService.readAll();
    }
}
