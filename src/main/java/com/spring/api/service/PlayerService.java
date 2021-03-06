package com.spring.api.service;

import com.spring.api.model.Player;

import java.util.List;

public interface PlayerService {

    public List<Player> players();

    public Player getPlayer(int id);

    public void addPlayer(Player player);

    public void deletePlayer(int id);


    public Player getPlayerByName(String name);
}
