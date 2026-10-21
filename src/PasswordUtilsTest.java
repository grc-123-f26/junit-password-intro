import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

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
        //arrange
        String password = "************";

        // act
        String actual = PasswordUtils.describePasswordLength(password);

        // assert
        assertEquals("long", actual);
    }

    @Test 
    void testDescribePasswordLengthExtraLongPassword(){
        // arrange
        String password = " iloveyouandmewithher";
        // act
        String actual = PasswordUtils.describePasswordLength(password);
        // assert
        assertEquals("extra long", actual);
    }

    @Test
    void testWordsContainingTwo(){
        String word = "hello";
        boolean actual = PasswordUtils.containsTriple(word);

        assertEquals(false, actual);
    }

    @Test 
    void testWordsContainingThree(){
        String word = "Paaasword";
        boolean actual = PasswordUtils.containsTriple(word);
        assertEquals(true, actual);
    }

    @Test
    void testForBlankSpace(){
        String word = "";
        int actual = PasswordUtils.countSpecialCharacters(word);
        assertEquals(0, actual);
    }

    @Test
    void testForSpecial(){
        String word = "HEll@W()r!d";
        int actual = PasswordUtils.countSpecialCharacters(word);
        assertEquals(4,actual);
    }

    @Test
    void testForNoSpecial(){
        String word = "HelloWorld";
        int actual = PasswordUtils.countSpecialCharacters(word);
        assertEquals(0, actual);
    }

    @Test 
    void testForSufficientSpecialCharater(){
        String word = "Paaaswor$$$$d";
        int minimum = 4;
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(word, minimum);
        assertEquals(true, actual);
    }

    @Test 
    void testForInsufficientSpecialCharater(){
        String word = "Paaaswor$$$$%^d";
        int minimum = 4;
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(word,minimum);
        assertEquals(false, actual);
    }

    @Test 
    void testForBlank(){
        String word = "";
        int minimum  =0;
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(word, minimum);
        assertEquals(false, actual);
    }


    

}
