import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        // arrage
        String password = "hello";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("short",actual);
    }

    @Test 
    void testDescribePasswordLengthExactly12Chars() {
        // arrange
        String password = "************";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("long",actual);
    }
    @Test
    void testDescribePasswordLengthExtraLongPassword() {
        //arrage
        String password = "sderftyuikjhgvfcdsrftyuikmnbvfsudgxdgiedigdgiiwd";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("extra long", actual);
  
    }
    @Test 
    void testContainsTripleHasTriple() {
        // arrange
        String password = "paaassword"; 
        // act
        boolean actual = PasswordUtils.containsTriple(password);
        //assert
        assertTrue(actual);
    }
    @Test 
    void testContainsTripleNoTriple() {
        //arrange
        String password = "paassword";
        //act
        boolean actual = PasswordUtils.containsTriple(password);
        //assert
        assertFalse(actual);
    }

    @Test 
    void testCountSpecialCharacters_Multiple() {
        //arrange
        String password = "pass!word@123#";
        //act
        int actual = PasswordUtils.countSpecialCharacters(password);
        //assert
        assertEquals(3,actual);

        }

        @Test
        void testHasSufficientSpecialCharacters() {
            //arrange
            String password = "pa#ss!word@123";
            int minimum = 3;
            //act
            boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);
            //assert
            assertTrue(actual); 
        }
}
