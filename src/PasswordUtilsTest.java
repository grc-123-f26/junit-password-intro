import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        //arrange
        String pwd = "hello";
        //act
        String actual = PasswordUtils.describePasswordLength(pwd);
        //assert
        assertEquals("short", actual);
        
    }
    @Test
    void testDescribePasswordLengthExactly12Chars() {
        //arrange
        String pwd = "************";
        //act
        String actual = PasswordUtils.describePasswordLength(pwd);
        //assert
        assertEquals("long", actual);
    }
    @Test
    void  testDescribePasswordLengthExtraLongPwd() {
        //arrange
        String pwd = "ExtraLongLOnglongExtraLongLOnglongExtraLongLOnglongExtraLongLOnglongExtraLongLOnglongExtraLongLOnglongExtraLongLOnglong";
        //act
        String actual = PasswordUtils.describePasswordLength(pwd);
        //assert 
        assertEquals("extra long", actual);
    }
    
    @Test
    void testIsAlphanumericHasAlphaNumericCharacters() {
        //arrange
        String pwd = "H3ll0";
        //act
        boolean actual = PasswordUtils.isAlphanumeric(pwd);
        //assert
        assertEquals(true, actual);
    }
    @Test
    void containsTriple() {
        //arrange
        String pwd = "Trippple";
        //act
        boolean actual = PasswordUtils.containsTriple(pwd);
        //assert
        assertEquals(true, actual);
    }
    @Test
    void containsTripleIsFalse() {
                //arrange
        String pwd = "Falalala";
        //act
        boolean actual = PasswordUtils.containsTriple(pwd);
        //assert
        assertEquals(false, actual);
    }
    @Test
    void containsTripleCaseMatters() {
                //arrange
        String pwd = "Aaab";
        //act
        boolean actual = PasswordUtils.containsTriple(pwd);
        //assert
        assertEquals(true, actual);
    }
    @Test
    void countSpecialCharacters() {
                //arrange
        String pwd = "k%3wi@";
        //act
        int actual = PasswordUtils.countSpecialCharacters(pwd);
        //assert
        assertEquals(2, actual);
    }
    // @Test
    // void countSpecialCharactersWithSpaces() {
    //             //arrange
    //     String pwd = "& *sdj ) <";
    //     //act
    //     int actual = PasswordUtils.countSpecialCharacters(pwd);
    //     //assert
    //     assertEquals(4, actual);
    // }
    @Test
    void hasSufficientSpecialCharactersTest() {
                //arrange
        String pwd = "!@#$%Hi* *";
        int min = 3;
        //act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(pwd, min);
        //assert
        assertEquals(true, actual);
    }
    @Test
    void hasSufficientSpecialCharactersIsFalse() {
                //arrange
        String pwd = "Hi!*";
        int min = 3;
        //act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(pwd, min);
        //assert
        assertEquals(false, actual);
    }
}
