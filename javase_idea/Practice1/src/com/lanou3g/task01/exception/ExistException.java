package com.lanou3g.task01.exception;

public class ExistException extends RegisterException {
    @Override
    public String getMessage() {
        return "账号已存在";
    }
}
