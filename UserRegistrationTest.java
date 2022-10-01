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
}