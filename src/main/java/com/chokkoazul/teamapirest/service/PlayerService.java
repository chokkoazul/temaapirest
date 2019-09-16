package com.chokkoazul.teamapirest.service;

import com.chokkoazul.teamapirest.controller.domain.Player;
import com.chokkoazul.teamapirest.entity.PlayerEntity;
import com.chokkoazul.teamapirest.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> list(){
        Iterable<PlayerEntity> memberEntities = playerRepository.findAll();

        List<Player> members = new ArrayList<>();

        memberEntities.forEach(entity -> members.add(convert(entity)));

        return members;
    }

    private Player convert(PlayerEntity entity) {
        if (entity != null){
            return Player.builder().name(entity.getName()).build();
        }
        return Player.builder().build();
    }

}
