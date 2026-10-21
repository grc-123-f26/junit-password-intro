import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
    // arrange
    String password = "hello";
    // act
    String actual = PasswordUtils.describePasswordLength(password);
    //assert
    assertEquals("short", actual);
    }

    @Test
    void testDescribePasswordLengthExactly12Chars()
    {
        // arrange
        String password = "************";
        // act
        String actual = PasswordUtils.describePasswordLength(password);
        // assert
        assertEquals("long", actual);
    }

    @Test 
    void testDescribePasswordLengthExtraLongPassword()
    {
        // arrange
        String password = "iugewrbegkjrebgkerjgjkrebkjgbrekbrejbgjkerbgjkr";
        // act
        String actual = PasswordUtils.describePasswordLength(password);
        // assert
        assertEquals("extra long", actual);
    }

    @Test 
    void testContainsDouble()
    {
        String password = "hello";
        boolean actual = PasswordUtils.containsTriple(password);
        assertEquals(false, actual);
    }

    @Test
    void testContainsTriple()
    {
        String password = "Paaasword";
        boolean actual = PasswordUtils.containsTriple(password);
        assertEquals(true, actual);
    }

    @Test 
    void testCountSpecialCharactersBlank()
    {
        String password = "";
        int actual = PasswordUtils.countSpecialCharacters(password);
        assertEquals(0, actual);
    }

    @Test
    void testCountNoSpecialCharacters()
    {
        String password = "Password";
        int actual = PasswordUtils.countSpecialCharacters(password);
        assertEquals(0, actual);
    }

    @Test
    void testCountSpecialCharacters()
    {
        String password = "P@55w*rd! ";
        int actual = PasswordUtils.countSpecialCharacters(password);
        assertEquals(4, actual);  
    }

    @Test 
    void testHasInsufficientSpecialCharacters()
    {
        String password = "Password! ";
        int minimum = 4;
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);
        assertEquals(false, actual);
    }

    @Test 
    void testHasBlank()
    {
        String password = "";
        int minimum = 4;
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);
        assertEquals(false, actual);
    }

    @Test 
    void testHasSufficientSpecialCharacters()
    {
        String password = "P@55w*rd! ";
        int minimum = 4;
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);
        assertEquals(true, actual);
    }
}
