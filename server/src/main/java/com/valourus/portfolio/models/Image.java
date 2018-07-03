package com.valourus.portfolio.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table( name = "t_images")
public class Image {

    @Id
    @GeneratedValue
    private int id;

    @Column( name = "c_url")
    private String url;

    @ManyToOne
    @JoinColumn (name="c_game_id")
    @JsonBackReference
    private Game game;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
