package com.lauradias.user_api.repository;

import com.lauradias.user_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
