package com.elatusdev.util;

import org.springframework.stereotype.Component;

@Component
public final class ErrorMsg {

    public final String getEntityNotFoundMsg(String entity, String name) {
        return new StringBuilder("No data found for ").append(entity).append("with name: ").append(name).toString();
    }
}
