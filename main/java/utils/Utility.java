package utils;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.BoundingBox;

import java.security.SecureRandom;
import java.util.UUID;

public class Utility {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int LENGTH = 8;
    private static final SecureRandom random = new SecureRandom();

    public static String generateRandomUserId() {
        StringBuilder userId = new StringBuilder(LENGTH);
        for (int i = 0; i < LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            userId.append(CHARACTERS.charAt(index));
        }
        return userId.toString();
    }

    public static String generateRandomYopmailEmail() {
        StringBuilder email = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(CHARACTERS.length());
            email.append(CHARACTERS.charAt(index));
        }
        email.append("@yopmail.com");
        return email.toString();
    }

    public static String generateRandomPhoneNumber() {
        StringBuilder phone = new StringBuilder();
        // Ensure first digit is not 0
        phone.append(random.nextInt(9) + 1);
        // Remaining 8 digits
        for (int i = 0; i < 8; i++) {
            phone.append(random.nextInt(10));
        }
        return phone.toString();
    }

    public static String generateRandomAccessLevel() {
        int randomNumber = random.nextInt(900) + 100; // generates 100–999
        return "AccessLevel" + randomNumber;
    }

    // Random User ID
    public static String generateUserId() {
        return "UserID" + (1000 + random.nextInt(9000));
    }

    // Random Email (Yopmail)
    public static String generateEmail() {
        return "user" + UUID.randomUUID().toString().substring(0, 6) + "@yopmail.com";
    }

    // Random Full Name
    public static String generateFullName() {
        String[] names = {"Sara", "Ayesha", "Fatima", "Zara", "Hira"};
        return names[random.nextInt(names.length)];
    }

    // Random Phone Number (10 digits)
    public static String generatePhone() {
        return "03" + (100000000 + random.nextInt(900000000));
    }

    // Random Strong Password
    public static String generatePassword() {
        return "Pass@" + (1000 + random.nextInt(9000)) + "Aa";
    }


}








