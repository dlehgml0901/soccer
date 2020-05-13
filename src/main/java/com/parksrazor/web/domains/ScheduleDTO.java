package com.parksrazor.web.domains;

import lombok.Data;

@Data
public class ScheduleDTO {
    public String stadium_id, sche_date, gubun,
                    hometeam_id, awayteam_id;
    public int home_score, away_score;
}
