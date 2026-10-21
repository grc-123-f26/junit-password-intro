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
        String password = "testDescribePasswordLengthExtraLongPassword6676767676767676";
        String actual = PasswordUtils.describePasswordLength(password);
        assertEquals("extra long", actual);
    }

    @Test
    void testDescribePasswordRepeatedLetter() {
        String password = "passsword"; 
        boolean actual = PasswordUtils.containsTriple(password);
        assertEquals(true, actual);
    }
    @Test
    void testSpecialCharacterCount() {
        String password = "passsword@@@"; 
        int actual = PasswordUtils.countSpecialCharacters(password);
        assertEquals(3, actual);
    }

    @Test
    void testSpecialCharacterCountWithEmptyString() {
        String password = "";
        int actual = PasswordUtils.countSpecialCharacters(password);
        assertEquals(0, actual);
    }
    @Test
    void testSpecialCharacterCountWithAllSpecialKey() {
        String password = "!@%!@%";
        int actual = PasswordUtils.countSpecialCharacters(password);
        assertEquals(6, actual);
    }
    @Test
    void testSpecialCharacterCountWithSpace() {
        String password = "   123123";
        int actual = PasswordUtils.countSpecialCharacters(password);
        assertEquals(3, actual);
    }

    @Test 
    void testSufficientSpecialCharactersExactlyMinimum() {
        String password = "p@ss!w0rd";
        int minimum = 2; 
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);
        assertEquals(true, actual);
    }
    @Test 
    void testSufficientSpecialCharactersBelowMinimum() {
        String password = "p@ss!w0rd";
        int minimum = 1; 
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);
        assertEquals(true, actual);
    }
    @Test 
    void testSufficientSpecialCharactersAboveMinimum() {
        String password = "p@ss!w0rd";
        int minimum = 3; 
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);
        assertEquals(false, actual);
    }
    @Test 
    void testSufficientSpecialCharactersNoMinimum() {
        String password = "password";
        int minimum = 0; 
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);
        assertEquals(true, actual);
    }
    @Test 
    void testSufficientSpecialCharactersWithEmptyString() {
        String password = "";
        int minimum = 3; 
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);
        assertEquals(false, actual);
    }
    
}
