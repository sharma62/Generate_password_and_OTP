
// Here we are using random() method of util package 
// class in Java
import java.util.*;

public class GenPassAndOtp {
    public static void main(String[] args) {
        System.out.println("Geenrate random password & Generate OTP ");
        System.out.println("1 for Generate random password ");
        System.out.println("2 for Generate OTP");
        Scanner input = new Scanner(System.in);
        int ch = input.nextInt();
        switch (ch) {
            case 1:
                // Length of your password as I have choose
                // here to be 8
                int length = 10;
                System.out.println(geek_Password(length));
                break;
            case 2:
                String otpSting  =generateOTP();//function calling
                System.out.println("OTP : "+otpSting);
                break;

            default:
            System.out.println("Invalid input please try again");
                break;
        }

    }

    // This our Password generating method
    // We have use static here, so that we not to
    // make any object for it
    static char[] geek_Password(int len) {
        System.out.println("Generating password using random() : ");
        System.out.print("Your new password is : ");

        // A strong password has Cap_chars, Lower_chars,
        // numeric value and symbols. So we are using all of
        // them to generate our password
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";

        String values = Capital_chars + Small_chars +
                numbers + symbols;

        // Using random method
        Random rndm_method = new Random();

        char[] password = new char[len];

        for (int i = 0; i < len; i++) {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            password[i] = values.charAt(rndm_method.nextInt(values.length()));

        }
        return password;
    }


    // generate a random OTP
    // We have use static here, so that we not to
    // make any object for it
    public static String generateOTP() 
    {   //int randomPin declared to store the otp
        //since we using Math.random() hence we have to type cast it int
        //because Math.random() returns decimal value
        int randomPin   =(int) (Math.random()*9000)+1000;
        String otp  = String.valueOf(randomPin);
        return otp; //returning value of otp
    }
}
