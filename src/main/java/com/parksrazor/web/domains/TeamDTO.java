package com.parksrazor.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class TeamDTO {
    public String team_id, region_name, team_name, e_team_name,
                    orig_yyyy, stadium_id, zip_code1, zip_code2,
                    address, ddd, tel, fax, homepage, team_owner;
}
