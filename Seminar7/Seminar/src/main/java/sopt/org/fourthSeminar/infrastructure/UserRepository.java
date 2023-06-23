package sopt.org.fourthSeminar.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import sopt.org.fourthSeminar.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // CREATE

    // READ
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);

    // UPDATE

    // DELETE
}
