package com.parksrazor.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PlayerDTO {
    public String playerId, playerName, ePlayerName, nickname, joinYyyy, position, backNo, nation, birthDate, solar,
            height, weight, teamId;
}
