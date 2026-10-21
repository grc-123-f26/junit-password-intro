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
        assertEquals("short",actual);
    }

    @Test
    void testDescribePasswordLengthExactly12Chars()
    {
        //arrange
        String password = "************";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("long", actual);
    }

    @Test 
    void testDescribePasswordLengthExtraLongPassword()
    {
        //arrange
        String password = "ajhbwfafhwbgfghwbefuwabefuwaeufkbwhadfadsbadsfsadfadfs";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("extra long", actual);
    }

    @Test
    void testDescribePasswordLengthContainsTriple()
    {
       //arrange
        String password = "fasaaaFAS";
        //act
        boolean actual = PasswordUtils.containsTriple(password);
        //assert
        assertEquals(true, actual);
    }

    @Test 
    void testDescribePasswordLengthCountSpecialCharacters()
    {
       //arrange
        String password = "abdc@@@fasf";
        //act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //assert
        assertEquals(3, actual);
    }

        @Test 
    void testDescribePasswordLengthHasSufficientSpecialCharacters()
    {
       //arrange
        String password = "abdc@@@fasf";
        
        //act
        int actual = PasswordUtils.hasSufficientSpecialCharacters(password,);
        //assert
        assertEquals(3, actual);
    }
}
