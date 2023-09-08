package com.bingo.server.controller;

import com.bingo.server.dto.CalendarRequestDto;
import com.bingo.server.dto.CalendarResponseDto;
import com.bingo.server.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calendar")
public class CalendarController {

    @Autowired
    private CalendarService calendarService;

    @RequestMapping("/getCalendar")
    public List<CalendarResponseDto> getCalendar(@RequestBody CalendarRequestDto calendarRequestDto) {
        return calendarService.getCalendar(calendarRequestDto);
    }
}
