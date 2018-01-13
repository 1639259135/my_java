package service.exception;

public class PasswordNotMathedException extends LoginException {
    @Override
    public String getMessage() {
        return "密码错误";
    }
}
