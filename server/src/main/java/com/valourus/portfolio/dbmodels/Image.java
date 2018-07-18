package com.valourus.portfolio.dbmodels;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table( name = "t_images")
public class Image {

    @Id
    @GeneratedValue
    private int id;

    @Lob
    @Column( name = "c_file")
    private Blob image;

    @ManyToOne
    @JoinColumn (name="c_game_id")
    @JsonBackReference
    private GameData game;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob url) {
        this.image = url;
    }

    public GameData getGame() {
        return game;
    }

    public void setGame(GameData game) {
        this.game = game;
    }
}
