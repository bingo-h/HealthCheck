package com.bingo.server.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalendarRequestDto {
    private Integer hpId;

    private Integer year;

    private Integer month;
}
