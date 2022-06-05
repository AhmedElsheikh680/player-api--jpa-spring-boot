package com.spring.api.controller;

import com.spring.api.model.Player;
import com.spring.api.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    // http://localhost:8080/api/v1/players
    @GetMapping("/players")
    public List<Player> players() {
        return playerService.players();
    }

    @GetMapping("/player/{id}")
    public Player getplayer(@PathVariable("id") int id) {
        Player p = playerService.getPlayer(id);
        if(p == null) {
            throw new RuntimeException("Player Not Found ID: "+id);
        }
        return p;
    }

    @PostMapping("/player")
    public Player addPlayer(@RequestBody Player player) {
        playerService.addPlayer(player);
        return player;
    }

    @PutMapping("/player")
    public Player updatePlayer(@RequestBody Player player) {
        playerService.addPlayer(player);
        return player;
    }

    @DeleteMapping("/player/{id}")
    public String deletePlayer(@PathVariable("id") int id) {
        playerService.deletePlayer(id);
        return "Deleted Successfully!!";
    }



    // http://localhost:8080/api/v1/player?name=Messi
    @GetMapping("/player")
    public Player getplayer(@RequestParam String name) {
        return playerService.getPlayerByName(name);
    }









































}
