
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {

    @Test
    void testDescribePasswordLengthShortPassword() {
        // arrange
        String password = "hello";

        // act
        String actual = PasswordUtils.describePasswordLength(password);

        // assert
        assertEquals("short", actual);
    }

    @Test
    void testDescribePasswordLengthExactlyMatch() {
        // arrange
        String password = "iiiiiiiiiiii";

        // act
        String actual = PasswordUtils.describePasswordLength(password);

        // assert
        assertEquals("long", actual);
    }

    @Test
    void testDescribepasswordLengthExtraLongPassword() {
        // arrange
        String password = "iiiiiiiiiiiiiiiasdiisadiasidiiiiiiiii";

        // act
        String actual = PasswordUtils.describePasswordLength(password);

        // assert
        assertEquals("extra long", actual);
    }

    @Test
    void testcheckifthereisthreeRepeatedCharacters() {
        // arrange
        String password = "iiiiiiiiiiii";

        // act
        boolean actual = PasswordUtils.containsTriple(password);

        // assert
        assertEquals(true, actual);
    }

    @Test
    void specialCharacterisAnynonalphanumericcharacter() {
        // arrange
        String password = "cccasdacac@!%@#!%*!s";

        // act
        int actual = PasswordUtils.countSpecialCharacters(password);

        // assert
        assertEquals(9, actual);
    }

    @Test
    void lasttesterForthisassignment() {
        // arrange
        String password = "iiiiiiiiiiii";

        // act
        boolean actual = PasswordUtils.containsTriple(password);

        // assert
        assertEquals(true, actual);
    }

    @Test
    void testHasSufficientSpecialCharacters() {
        // arrange
        String password = "hello@!123";
        int minimum = 2;

        // act
        boolean actual =
            PasswordUtils.hasSufficientSpecialCharacters(password, minimum);

        // assert
        assertEquals(true, actual);
    }

    @Test
    void testNotEnoughSpecialCharacters() {
        // arrange
        String password = "hello@123";
        int minimum = 2;

        // act
        boolean actual =
            PasswordUtils.hasSufficientSpecialCharacters(password, minimum);

        // assert
        assertEquals(false, actual);
    }

    @Test
    void testExactlyMinimumSpecialCharacters() {
        // arrange
        String password = "hello@#123";
        int minimum = 2;

        // act
        boolean actual =
            PasswordUtils.hasSufficientSpecialCharacters(password, minimum);

        // assert
        assertEquals(true, actual);
    }
}
