package portfolio.seeders;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import portfolio.models.GamePage;
import portfolio.repos.GamePageRepository;

@Component
public class GamePageSeeder implements TableSeeder {

    @Autowired
    private GamePageRepository gamePageRepository;

    @Override
    public void seed(Faker faker) {
        for(int i = 0;i < 5;i++) {
            GamePage gp = new GamePage();
            gp.setName( faker.name().fullName() );
            gp.setDescription( faker.lorem().paragraph() );
            gamePageRepository.save(gp);
        }
    }
}
