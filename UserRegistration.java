import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+[.+-]?[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.][a-zA-Z]+[.]?[a-zA-Z]+[,]?$";

    public boolean validateEmailId(String emailId) {
        return patternChecker(emailId, EMAIL_PATTERN);
    }

    public boolean patternChecker(String input,String fieldPattern) {
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}