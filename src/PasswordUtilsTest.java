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

}
