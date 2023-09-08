package com.bingo.server.service;

import com.bingo.server.dto.CalendarRequestDto;
import com.bingo.server.dto.CalendarResponseDto;

import java.util.List;

public interface CalendarService {
    List<CalendarResponseDto> getCalendar(CalendarRequestDto calendarRequestDto);
}
