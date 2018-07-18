package com.valourus.portfolio.apimodels;

import com.valourus.portfolio.apimodels.interfaces.Game;
import com.valourus.portfolio.dbmodels.GameData;

public class GameImpl implements Game {

    private GameData data;

    public GameImpl(GameData data) {
        this.data = data;
    }

    @Override
    public void setName(String name) {
        data.setName(name);
    }

    @Override
    public void setDescription(String description) {
        data.setDescription(description);
    }

    @Override
    public int getId() {

        return data.getId();
    }

    @Override
    public String getName() {
        return data.getName();
    }

    @Override
    public String getDescription() {
        return data.getDescription();
    }
}
