package com.spring.changementserie.Repository;

import com.spring.changementserie.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByEmailAndPassword(String login,String password);
    User findByNom(String nom);


    User findByEmail(String login);
}
