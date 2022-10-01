import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenFirstLatterUpperCase_ShouldReturnTrue() {
        boolean result = userRegistration.validateFirstName("Bharat");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Bh");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenHasNumber_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Bha1");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Bh@rat");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue(){
        boolean result = userRegistration.validateLastName("Pathak");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenLessThanThreeChar_shouldReturnFalse() {
        boolean result = userRegistration.validateLastName("Pa");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenHasNumber_ShouldReturnFalse() {
        boolean result = userRegistration.validateLastName("Pathak1");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenHasSpecialChar_ShouldReturnFalse() {
        boolean result = userRegistration.validateLastName("P@th@k");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.validateEmailId("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenSpaceIsMentioned_ShouldReturnTrue(){
        boolean result = userRegistration.validateMobileNumber("91 7559201322");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenSpaceNotMentioned_ShouldReturnFalse() {
        boolean result = userRegistration.validateMobileNumber("917559201322");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenLessDigits_ShouldReturnFalse() {
        boolean result = userRegistration.validateMobileNumber("755920132");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenNotStartWith91_ShouldReturnFalse() {
        boolean result = userRegistration.validateMobileNumber("1234567890");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenMin8Chars_ShouldReturnTrue() {
        boolean result = userRegistration.validatePassword("bTb1h2*rt");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenAtLeast1UpperCase_ShouldReturnTrue() {
        boolean result = userRegistration.validatePassword("3PbRa*aK");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenAtLeast1Number_ShouldReturnTrue() {
        boolean result = userRegistration.validatePassword("PaT5bt&Kt");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNoNumeric_ShouldReturnFalse() {
        boolean result = userRegistration.validatePassword("pAth%aKP");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenHasExact1SpecialChar_ShouldReturnTrue() {
        boolean result = userRegistration.validatePassword("bHar%aT1");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNoSpecialChar_ShouldReturnFalse() {
        boolean result = userRegistration.validatePassword("bTapaK12");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenHasMoreThan1SpecialChar_ShouldReturnFalse() {
        boolean result = userRegistration.validatePassword("bHar%a#T1");
        Assert.assertTrue(result);
    }
}