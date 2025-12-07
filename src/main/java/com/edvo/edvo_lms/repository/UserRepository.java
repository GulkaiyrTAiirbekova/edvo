package com.edvo.edvo_lms.repository;

import com.edvo.edvo_lms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    boolean existByUsername(String username);

}
