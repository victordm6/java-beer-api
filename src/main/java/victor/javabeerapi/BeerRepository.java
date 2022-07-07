package victor.javabeerapi;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String name);
}
