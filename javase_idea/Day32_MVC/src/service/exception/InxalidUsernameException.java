package service.exception;

public class InxalidUsernameException extends LoginException{
    @Override
    public String getMessage() {
        return "用户名错误";
    }
}
