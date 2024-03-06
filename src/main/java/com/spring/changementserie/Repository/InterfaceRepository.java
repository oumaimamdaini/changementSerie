package com.spring.changementserie.Repository;

import com.spring.changementserie.Models.Interface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
@EnableJpaRepositories
@Repository
public interface InterfaceRepository extends JpaRepository<Interface,Integer> {
}
