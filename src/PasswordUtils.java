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
     *          or "extra long" if it has21 or more characters
     */
    public static String describePasswordLength(String password) {
        int length = password.length();
        if (length < 6) {
            return "short";
        } else if (length < 12) {
            return "medium";
        } else if (length < 21) {
        return "long";
    } else {
    return "extra long";
}

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

    // For a password that has three letters in a row
    // "paaassword"
    //return true if it has three

    public static boolean containsTriple(String password){
        if (password == null || password.length() < 3) {
            return false;
        }

    for (int i = 0; i < password.length() - 3; i++) {
        char first = password.charAt(i);
        char second = password.charAt(i + 1);
        char third = password.charAt(i + 2);

        if(first == second && second == third) {
            return true;
        }

    }

    return false;

    }

    // returns the number of special characters in the password
    //Special characters like *, #, @ , !, so not letters or numbers

    public static int countSpecialCharacters(String password) {
        if (password == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                count++;
            }
        }
        return count; 
    }
    public static boolean hasSufficientSpecialCharacters(String password, int minimum) {
        return countSpecialCharacters(password) >= minimum;
    }

}
