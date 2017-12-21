package com.lanou3g.task01.exception;

public class NoExistException extends LoginException {

    @Override
    public String getMessage() {
        return "账号不存在,请重新输入";
    }

}
