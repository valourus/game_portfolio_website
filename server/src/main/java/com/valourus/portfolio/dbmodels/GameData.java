package com.valourus.portfolio.dbmodels;

import javax.persistence.*;
import java.util.Set;

@Entity()
@Table( name = "t_game_pages")
public class GameData {

    @Id
    @GeneratedValue
    private int id;

    @Column( name = "c_name")
    private String name;

    @Column( name = "c_description")
    private String description;

    @Column( name = "c_game_images")
    @OneToMany( mappedBy = "game")
    private Set<Image> images;

    public GameData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }
}
