package proj.restaurant_k_p_o4.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import proj.restaurant_k_p_o4.domain.user.User;


public interface UserRepository extends JpaRepository<User, Integer> {

    boolean existsByUsernameIgnoreCase(String username);

    boolean existsByEmailIgnoreCase(String email);

}
