public class UserRegistrationException extends Exception {
    static String message;
    enum ExceptionType{
        ENTERED_NULL, ENTERED_INVALID
    }
    ExceptionType type;
    public UserRegistrationException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }
}