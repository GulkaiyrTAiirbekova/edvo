package com.edvo.edvo_lms.repository;

import com.edvo.edvo_lms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
