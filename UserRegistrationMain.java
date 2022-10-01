public class UserRegistrationMain {

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.firstNameValidate();
        userRegistration.lastNameValidate();
        userRegistration.emailValidate();
        userRegistration.mobileValidate();
        userRegistration.passwordValidate();
    }
}