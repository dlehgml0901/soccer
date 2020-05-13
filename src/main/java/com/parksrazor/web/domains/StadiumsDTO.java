package com.parksrazor.web.domains;

import lombok.Data;

@Data
public class StadiumsDTO {
    public String stadium_id, stadium_name, hometeam_id,
                    address, ddd, tel;
    public int seat_count;
}
