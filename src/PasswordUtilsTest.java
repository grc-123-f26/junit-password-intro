import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        // arrange
        String password = "hello";

        // act
        PasswordUtils.describePasswordLength(password);
        String actual = PasswordUtils.describePasswordLength(password);

        // assert
        assertEquals("short", actual);

    }

    @Test
    void testDescribePasswordLengthExactly12Chars()
    {
        // arrange
        String password = "************";

        // act
        String actual = PasswordUtils.describePasswordLength(password);

        //assert
        assertEquals("long", actual);
    }

    @Test 
    void testDescribePasswordLengthExtraLongPassword()
    {
        String password = ";djk;owohef;kqjwnefqiuhfkjnknafiuhqkfnqieuhfkqjnefiquefkqfrq";

        String actual = PasswordUtils.describePasswordLength(password);

        assertEquals("extra long", actual);
    }

    @Test
    void testIsAlphaNumericSpecialCharacterInMiddleOfPassword()
    {
        //arrange
        String password = "Fa!f1gj";

        //act
        boolean actual = PasswordUtils.isAlphanumeric(password);

        //assert
        assertEquals(false, actual);
    }

    @Test
    void testIsAlphaNumericSpecialCharacterAtEndOfPassword()
    {
        //arrange
        String password = "123357)";
        //act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //assert
        assertEquals(false, actual);
    }

    @Test
    void testContainsTripleConsecutiveLetters()
    {
        String password = "paaassword";

        boolean actual = PasswordUtils.containsTriple(password);

        assertEquals(true, actual);

    }

    @Test
    void testContainsTwoInstancesOfConsecutiveletters()
    {
        String password = "paaasssword";

        boolean actual = PasswordUtils.containsTriple(password);

        assertEquals(true, actual);
    }

    @Test
    void testCountSpecialCharactersAndCheckIfNone()
    {
        String password = "password";

        int actual = PasswordUtils.countSpecialCharacters(password);

        assertEquals(0, actual);
    }

    @Test
    void testCountSpecialCharactersWithScatteringOfSpecialCharacters()
    {
        String password = "pas!sw#or%d";

        int actual = PasswordUtils.countSpecialCharacters(password);

        assertEquals(3, actual);

    }

    @Test
    void testMinimumTwoSpecialCharacters()
    {
        String password = "pass&wo*rd";

        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, 2);

        assertEquals(true, actual);
    }

    @Test
    void testIfNoSpecialCharacters()
    {
        String password = "password";

        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, 0);

        assertEquals(true, actual);
        
    }
}
