package com.valourus.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.valourus.portfolio.models.GamePage;
import com.valourus.portfolio.repos.GamePageRepository;

import java.util.List;
@RestController
public class GameController {

    @Autowired
    private GamePageRepository gamePageRepository;

    @GetMapping("/")
    List<GamePage> getGamePages() {
        List<GamePage> x = gamePageRepository.findAll();
        return x;
    }
}
