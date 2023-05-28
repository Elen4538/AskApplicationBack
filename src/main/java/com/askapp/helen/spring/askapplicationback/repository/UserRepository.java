package com.askapp.helen.spring.askapplicationback.repository;

import com.askapp.helen.spring.askapplicationback.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author elena
 * @project AskApplicationBack
 * @date 26/05/2023
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
