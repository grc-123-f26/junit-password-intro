
/**
 * Utility class for analyzing passwords.
 */
public class PasswordUtils {

    /**
     * Returns a description of the password's length.
     *
     * @param password the password to analyze
     * @return "short" if fewer than 6 characters,
     *         "medium" if between 6 and 11,
     *         "long" if between 12 and 20,
     *         "extra long" if more than 20
     */
    public static String describePasswordLength(String password) {
        int length = password.length();

        if (length < 6) {
            return "short";
        } else if (length < 12) {
            return "medium";
        } else if (length <= 20) {
            return "long";
        }

        return "extra long";
    }

    /**
     * Checks whether the password contains only letters and digits.
     *
     * @param password the password to check
     * @return true if alphanumeric, false otherwise
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
     * Checks whether a password has a character repeated
     * at least three times in a row.
     *
     * @param password the password to check
     * @return true if a triple exists, false otherwise
     */
    public static boolean containsTriple(String password) {
        if (password.length() < 3) {
            return false;
        }

        for (int i = 0; i < password.length() - 2; i++) {
            char c1 = password.charAt(i);
            char c2 = password.charAt(i + 1);
            char c3 = password.charAt(i + 2);

            if (c1 == c2 && c2 == c3) {
                return true;
            }
        }

        return false;
    }

    /**
     * Returns the number of special characters in the password.
     *
     * A special character is any non-alphanumeric character.
     *
     * @param password the password to check
     * @return the count of special characters
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
     * Checks whether a password has at least a minimum
     * number of special characters.
     *
     * @param password the password to check
     * @param minimum the minimum number of special characters
     * @return true if the minimum is met, false otherwise
     */
    public static boolean hasSufficientSpecialCharacters(
            String password, int minimum) {

        int count = countSpecialCharacters(password);

        return count >= minimum;
    }
}
