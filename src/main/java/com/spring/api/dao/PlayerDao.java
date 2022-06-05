package com.spring.api.dao;

import com.spring.api.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
//@RepositoryRestResource(path="persons")
public interface PlayerDao extends JpaRepository<Player, Integer> {

//    // http://localhost:8080/api/players/search/findByName?name=Messi
//    Player findByName(@RequestParam String name);
//
//
//    // http://localhost:8080/api/persons/search/findByNameContaining?name=K
//    Player findByNameContaining(@RequestParam String name);
//

    Player findByName(@RequestParam String name);
}
