package portfolio.models;

import javax.persistence.*;

@Entity()
@Table( name = "game_pages")
public class GamePage {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String description;

    public GamePage() {
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
}
