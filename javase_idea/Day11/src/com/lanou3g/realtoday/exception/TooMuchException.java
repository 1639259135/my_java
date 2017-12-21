package com.lanou3g.realtoday.exception;

public class TooMuchException extends EatException {

    @Override
    public String getMessage() {
        return "吃饱了,撑死了";
    }
}
