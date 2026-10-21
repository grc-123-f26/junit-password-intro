import static org.junit.Assert.assertEquals;

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
    void testDescribePasswordLengthExactly12Chars() {
        // arrange
        String password = "************";

        // act
        String actual = PasswordUtils.describePasswordLength(password);

        // assert
        assertEquals("long", actual);
    }

    @Test 
    void testDescribePasswordLengthExtraLongPassword() {
        // arrange
        String password = "aosdlaskalskdjlaksdakjsdasldadfnalksjdadihfsdjgnksjdfhoaisdkasd";

        // act
        String actual = PasswordUtils.describePasswordLength(password);

        // assert
        assertEquals("extra long", actual);
    }

    @Test 
    void testIsAlphaNumeric() {
        // arrange
        String password = "h3ll0";

        // act
        boolean actual = PasswordUtils.isAlphanumeric(password);

        // assert
        assertEquals(true, actual);
    }

    @Test
    void testContainsTriple() {
        // arrange
        String password = "hellooo";

        // act
        boolean actual = PasswordUtils.containsTriple(password);

        // assert
        assertEquals(true, actual);
    }

    @Test
    void testCountSpecialCharacters() {
        // arrange 
        String password = "he//@";

        // act
        int actual = PasswordUtils.countSpecialCharacters(password);

        // assert
        assertEquals(3, actual);
    }

    @Test
    void testHasSufficientSpecialCharacters() {
        // arrange
        String password = "he//o";
        int minimum = 3;

        // act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);

        // assert
        assertEquals(false, actual);
    }
}
