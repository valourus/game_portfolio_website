package com.valourus.portfolio.services;

import com.valourus.portfolio.apimodels.GameImpl;

import java.util.List;

public interface GameService {

    public List<GameImpl> readAll();

}
