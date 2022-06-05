package com.spring.api.service;

import com.spring.api.dao.PlayerDao;
import com.spring.api.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerDao playerDao;
    @Override
    public List<Player> players() {
        return playerDao.findAll();
    }

    @Override
    public Player getPlayer(int id) {
        return playerDao.findById(id).get();
    }

    @Override
    public void addPlayer(Player player) {
        playerDao.save(player);

    }

    @Override
    public void deletePlayer(int id) {
        playerDao.deleteById(id);
    }

    @Override
    public Player getPlayerByName(String name) {
        return playerDao.findByName(name);
    }
}
