package com.parksrazor.web.domains;

import lombok.Data;

@Data
public class PlayerDTO {
    String player_id, player_name, team_id, e_player_name,
            nickname, join_yyyy, position, back_no, nation,
            birth_date, solar, height, weight;
}
