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
     *         or "long" if it has 12 to 20 characters (inclusive)
     *          or "extra long" if it has 21 or more character
     */
    public static String describePasswordLength(String password) {
        int length = password.length();
        if (length < 6) {
            return "short";
        } else if (length < 12) {
            return "medium";
        } else if (length < 21) {
            return "long";
        }
        return "extra long";
    }

    /**
     * Checks whether the password contains only letters and digits.
     *
     * @param password the password to check
     * @return true if the password is alphanumeric, false otherwise
     */
    public static boolean isAlphanumeric(String password) {
        for (int i = 0; i < password.length() - 1; i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    /* */ 
    /* */
    public static boolean containsTriple(String password) {
        for (int i = 0; i < password.length() - 1; i++) {
            if (password.charAt(i) == password.charAt(i+1)) {
                if (password.charAt(i+1) == password.charAt(i+2)) {
                    return true;
                } else {
                    return false;
                }
            } 
        }
        return false;
    }

    public static int countSpecialCharacters(String password) {
        int count = 0;
        
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isAlphabetic(c) && !Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public static boolean hasSufficientSpecialCharacters(String password, int minimum) {
        return countSpecialCharacters(password) >= minimum;
    }

}