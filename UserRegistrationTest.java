import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenFirstLatterUpperCase_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            Assert.assertTrue(userRegistration.validateFirstName("Bharat"));
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
    }

    @Test
    public void givenFirstName_WhenEntryFieldNull_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            Assert.assertFalse(userRegistration.validateFirstName(""));
        } catch (UserRegistrationException exception) {
            NullPointerException.class.getClass();
            System.out.println("Entry Field Should Not Null");
        }
    }

    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            Assert.assertFalse(userRegistration.validateFirstName("Bh"));
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            System.out.println("First Name Should Not Less Than 3 Digit");
        }
    }

    @Test
    public void givenFirstName_WhenHasNumber_ShouldReturnFalse() {
        try {
            Assert.assertFalse(userRegistration.validateFirstName("Bharat1"));
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
    }

    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userRegistration.validateFirstName("Bh@rat");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userRegistration.validateLastName("Pathak");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userRegistration.validateLastName("Bp");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenHasNumber_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userRegistration.validateLastName("Pathak1");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenHasSpecialChar_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userRegistration.validateLastName("P@thak");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userRegistration.validateEmailId("abc.xyz@bl.co.in");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenSpaceIsMentioned_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userRegistration.validateMobileNumber("91 7559201322");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenSpaceNotMentioned_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userRegistration.validateMobileNumber("917559201322");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenLessDigits_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userRegistration.validateMobileNumber("7559201322");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenNotStartWith91_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userRegistration.validateMobileNumber("1234567890");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenMin8Chars_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userRegistration.validatePassword("bTb1h2*rt");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenHasLessChars_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userRegistration.validatePassword("Bp9%t");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenAtLeast1UpperCase_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userRegistration.validatePassword("3PbRa*aK");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenAtLeast1Number_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userRegistration.validatePassword("PaT5bt&Kt");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNoNumeric_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userRegistration.validatePassword("pAth%aKP");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenHasExact1SpecialChar_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userRegistration.validatePassword("bHar%aT1");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNoSpecialChar_ShouldReturnTrue() {
        boolean result = true;
        try {
            result = userRegistration.validatePassword("bTapaK12");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenHasMoreThan1SpecialChar_ShouldReturnTrue() {
        boolean result = true;
        try {
            result = userRegistration.validatePassword("bHar%a#T1");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(result);
    }
}