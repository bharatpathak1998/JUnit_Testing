import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,20}";
    public static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+[.+-]?[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.][a-zA-Z]+[.]?[a-zA-Z]+[,]?$";
    public static final String MOBILE_PATTERN = "^[0-9]{0,2}[ ][0-9]{10}";
    public static final String PASSWORD_PATTERN = "(?=.*[A-Z]+)(?=.*[0-9]+).{8,}";

    public boolean validateFirstName(String firstName) throws UserRegistrationException {
        return patternChecker(firstName, NAME_PATTERN);
    }

    public boolean validateLastName(String lastName) throws UserRegistrationException {
        return patternChecker(lastName, NAME_PATTERN);
    }

    public boolean validateEmailId(String emailId) throws UserRegistrationException {
        return patternChecker(emailId, EMAIL_PATTERN);
    }

    public boolean validateMobileNumber(String mobileNumber) throws UserRegistrationException {
        return patternChecker(mobileNumber, MOBILE_PATTERN);

    }

    public boolean validatePassword(String password) throws UserRegistrationException {
        return patternChecker(password, PASSWORD_PATTERN);
    }

    private boolean patternChecker(String input, String fieldPattern) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(input);
        try {
            boolean result = matcher.matches();
            if (!result)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID,
                        "Please Give Valid Entry");
            return true;
        } catch (NullPointerException exception) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL,
                    "Entry Should Be Not null ");
        }
    }
}