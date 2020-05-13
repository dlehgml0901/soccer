package com.parksrazor.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class StadiumsDTO {
    public String stadium_id, stadium_name, hometeam_id,
                    address, ddd, tel;
    public int seat_count;
}
