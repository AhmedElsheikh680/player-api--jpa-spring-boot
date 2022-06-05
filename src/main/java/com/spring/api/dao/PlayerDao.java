package com.spring.api.dao;

import com.spring.api.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//@Repository
@RepositoryRestResource(path="persons")
public interface PlayerDao extends JpaRepository<Player, Integer> {
}
