package com.bingo.server.desensitizer;

import lombok.Data;
import lombok.Getter;

import java.util.function.Function;

@Getter
public enum Strategy {

    USERID(s -> s.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2")),

    ID_CARD(s -> s.replaceAll("(\\d{3})\\d{13}(\\w{2})", "$1****$2"));

    private final Function<String, String> desensitizer;


    Strategy(Function<String, String> desensitizer) {
        this.desensitizer = desensitizer;
    }
}
