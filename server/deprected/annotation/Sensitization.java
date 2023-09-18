package com.bingo.server.annotation;

import com.bingo.server.desensitizer.SensitiveJsonSerializer;
import com.bingo.server.desensitizer.Strategy;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@JsonSerialize(using = SensitiveJsonSerializer.class)
public @interface Sensitization {
    Strategy strategy();
}
