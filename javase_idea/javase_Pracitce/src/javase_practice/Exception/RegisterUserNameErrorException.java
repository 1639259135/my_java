package javase_practice.Exception;

public class RegisterUserNameErrorException extends Exception{
    @Override
    public String getMessage() {
        return "账号格式不正确";
    }
}
