package proj.restaurant_k_p_o4.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import proj.restaurant_k_p_o4.domain.Session;


public interface SessionRepository extends JpaRepository<Session, Integer> {
}
