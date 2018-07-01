package portfolio.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.models.GamePage;

@Repository
public interface GamePageRepository extends JpaRepository<GamePage, Integer> {

}