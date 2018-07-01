package portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio.models.GamePage;
import portfolio.repos.GamePageRepository;

import java.util.List;
import java.util.Optional;

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
