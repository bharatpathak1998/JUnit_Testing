import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface DataValidate {
    void Validator();
}

public class UserRegistrationMain {

    public static void main(String[] args) {
        // Lambda Expression ->
        DataValidate firstName = () -> {
            Scanner sc = new Scanner(System.in);

            String regex = "^[A-Z]{1}[a-z]{3,20}$";

            System.out.println("Enter your First name");
            String name = sc.next();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("Given First Name Is Valid");
            } else {
                System.out.println("Given First Name Is InValid");
            }
        };
        firstName.Validator();

        DataValidate lastName = () -> {
            Scanner sc = new Scanner(System.in);

            String regex = "^[A-Z]{1}[a-z]{3,20}$";

            System.out.println("Enter your last name");
            String name = sc.next();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("Given Last Name Is Valid");
            } else {
                System.out.println("Given Last Name Is InValid");
            }
        };
        lastName.Validator();

        DataValidate eMail = () -> {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Your Email Id");
            String email = sc.next();

            Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
            } else {
                System.out.println("Given Email Id Is InValid");
            }
        };
        eMail.Validator();

        DataValidate Mobile = () -> {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Your Mobile Number");
            String mobile = sc.nextLine();

            Pattern pattern = Pattern.compile("^[0-9]{0,2}[ ][0-9]{10}");
            Matcher matcher = pattern.matcher(mobile);
            if (matcher.matches()) {
            } else {
                System.out.println("Given Mobile Number Is InValid");
            }
        };
        Mobile.Validator();

        DataValidate Password = () -> {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your Password");
            String password = sc.next();

            Pattern pattern = Pattern.compile("^(?=.{8,20})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
            } else {
                System.out.println("Given Password Is InValid");
            }
        };
        Password.Validator();
    }
}