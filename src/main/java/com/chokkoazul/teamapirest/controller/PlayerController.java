package com.chokkoazul.teamapirest.controller;

import com.chokkoazul.teamapirest.controller.domain.Player;
import com.chokkoazul.teamapirest.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping()
    public List<Player> list() {
        return playerService.list();
    }

}
