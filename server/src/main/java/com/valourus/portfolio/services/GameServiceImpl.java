package com.valourus.portfolio.services;

import com.valourus.portfolio.apimodels.GameImpl;
import com.valourus.portfolio.repos.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository gameRepository;

    @Override
    public List<GameImpl> readAll() {
        return gameRepository.findAll().stream()
                .map(data -> new GameImpl(data))
                .collect(Collectors.toList());
    }

}
