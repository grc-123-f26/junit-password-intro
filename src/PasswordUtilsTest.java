import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        //arrange
        String password = "hello";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("short", actual);

    }

    @Test 
    void testDescribePasswordLengthExactly12Chars() {
        // arrange
        String password = "************";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        // assert
        assertEquals("long", actual);
    }

    @Test 
    void testDescribePasswordLengthExtraLongPassword() {
        //arrange
        String password = "asdnlkasndkasndlkasndandsandklsandklsadnasndwnkandwjkndjnk";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("extra long", actual);
    }

    @Test
    void testContainsTripleInMiddle() {
        //arrange
        String password = "paaasword";
        //act
        boolean actual = PasswordUtils.containsTriple(password);
        //assert
        assertEquals(true, actual);
    }

    @Test 
    void testisAlphanumeric() {
        //arrange
        String password = "He11oWor1d";
        String password1 = "He11oWor1d!!";
        //act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        boolean actual1 = PasswordUtils.isAlphanumeric(password1);
        //assert
        assertEquals(true, actual);
        assertEquals(false, actual1);
    }

    @Test
    void testContainsTripleAtEnd(){
        //arrange
        String password = "abccc";
        //act
        Boolean actual = PasswordUtils.containsTriple(password);
        //assert
        assertEquals(true, actual);
    }


    @Test
    void testCountSpecialCharactersSome(){
        //arrange
        String password = "p@ss!w#rd";
        //act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //assert
        assertEquals(3, actual);
    }
    
    @Test 
    void testCountSpecialCharactersLastCharSpecial() {
        //arrange
        String password = "password!";
        //act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //assert
        assertEquals(1, actual);
    }

    @Test
    void testHasSufficientSpecialCharactersExactlyMinimum() {
        //arrange
        String password = "a!b@";
        int minimum = 2;
        //act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);
        //assert
        assertEquals(true, actual);
    }

    @Test
    void testHasSufficientSpecialCharactersBelowMinimum() {
        //arrange
        String password = "abc!";
        int minimum = 2;
        //act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);
        //assert
        assertEquals(false, actual);
    }
}