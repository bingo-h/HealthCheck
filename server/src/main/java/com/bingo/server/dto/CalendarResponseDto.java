package com.bingo.server.dto;

import lombok.*;

/**
 * 生成不同对象的个性化日历
 */
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class CalendarResponseDto {

    @NonNull
    private String Date;

    private Integer Maximum;

    private Integer Exist;

    private Integer Remain;
}
