package com.bingo.server.dto;

import lombok.*;

/**
 * 生成不同对象的个性化日历
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class CalendarResponseDto {

    @NonNull
    private String date;

    private Integer maximum;

    private Integer exist;

    private Integer remain;
}
