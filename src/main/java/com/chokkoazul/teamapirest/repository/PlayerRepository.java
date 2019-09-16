package com.chokkoazul.teamapirest.repository;

import com.chokkoazul.teamapirest.entity.PlayerEntity;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<PlayerEntity, Long> {
}
