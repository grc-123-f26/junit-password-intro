import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

/**
 * Utility class for analyzing passwords.
 */
public class PasswordUtils {

    /**
     * Returns a description of the password's length.
     *
     * @param password the password to analyze
     * @return "short" if the password has fewer than 6 characters,
     *         "medium" if it has between 6 and 11 characters (inclusive),
     *         or "long" if it has 12 or more characters
     */
    public static String describePasswordLength(String password) {
        int length = password.length();
        if (length < 6) {
            return "short";
        } else if (length < 12) {
            return "medium";
        }
        return "long";
    }

    /**
     * Checks whether the password contains only letters and digits.
     *
     * @param password the password to check
     * @return true if the password is alphanumeric, false otherwise
     */
   public static boolean isAlphanumeric(String password) {
    for (int i = 0; i < password.length(); i++) {
        char c = password.charAt(i);

        if (!Character.isLetterOrDigit(c)) {
            return false;
        }
    }

    return true;
}

/**
 * Checks whether a password has a character
 * repeated at least three times in a row.
 */
public static boolean containsTriple(String password) {
    for (int i = 0; i < password.length() - 2; i++) {
        char first = password.charAt(i);
        char second = password.charAt(i + 1);
        char third = password.charAt(i + 2);

        if (first == second && second == third) {
            return true;
        }
    }

    return false;
}

/**
 * Counts the special characters in a password.
 */
public static int countSpecialCharacters(String password) {
    int count = 0;

    for (int i = 0; i < password.length(); i++) {
        char c = password.charAt(i);

        if (!Character.isLetterOrDigit(c)) {
            count++;
        }
    }

    return count;
}

/**
 * Checks if a password has enough special characters.
 */
public static boolean hasSufficientSpecialCharacters(
        String password, int minimum) {

    int count = countSpecialCharacters(password);

    if (count >= minimum) {
        return true;
    }

    return false;
}

}