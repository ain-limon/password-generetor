

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the password: ");
        int length = input.nextInt();

        System.out.print("Include lowercase letters? (y/n): ");
        boolean includeLower = input.next().equalsIgnoreCase("y");

        System.out.print("Include uppercase letters? (y/n): ");
        boolean includeUpper = input.next().equalsIgnoreCase("y");

        System.out.print("Include numbers? (y/n): ");
        boolean includeNumbers = input.next().equalsIgnoreCase("y");

        System.out.print("Include special characters? (y/n): ");
        boolean includeSpecial = input.next().equalsIgnoreCase("y");

        String lower_cases = "qwertyuiopasdfghjklzxcvbnm";
        String upper_cases = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()-_+=<>?";

        String password = "";
        String charPool = "";

        if (includeLower) charPool += lower_cases;
        if (includeUpper) charPool += upper_cases;
        if (includeNumbers) charPool += digits;
        if (includeSpecial) charPool += specialChars;

        if (charPool.isEmpty()) {
            System.out.println("You must select at least one character type.");
            return;
        }

        for (int i = 0; i < length; i++) {
            int rand = (int) (charPool.length() * Math.random());
            password += charPool.charAt(rand);
        }

        System.out.println("Generated Password: " + password);
    }
}
