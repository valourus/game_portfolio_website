package portfolio.seeders;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Seeder {

    @Autowired
    private GamePageSeeder gamePageSeeder;

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Faker faker = new Faker();
        gamePageSeeder.seed(faker);
    }
}
