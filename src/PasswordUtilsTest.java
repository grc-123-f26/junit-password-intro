import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        //Arrange
        String password = "hello";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);

        //Assert
        assertEquals("short", actual);
    }

    @Test 
    void testDescribePasswordLengthExact12(){
        String password = "greenlantern";

        String actual = PasswordUtils.describePasswordLength(password);
        assertEquals("long", actual);
    }

    @Test
    void testDescribePasswordLengthExtraLong(){
        //arrange
        String password = "extraaaaaaalooongggggggggggpasssswordddddddddd";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("extra long", actual);
    }

    @Test
    void testisAlphanumeric(){
        String str = "asda1";

        boolean actual = PasswordUtils.isAlphanumeric(str);

        assertEquals(false, actual);
    }

    @Test
    void testcontainsTriple(){
        String str = "aafddds";

        boolean actual = PasswordUtils.containsTriple(str);

        assertEquals(true, actual);
    }

    @Test 
    void testcontainsSpecialChars(){
        String str = "asfafaf***";

         int actual = PasswordUtils.countSpecialCharacters(str);

         assertEquals(1, actual);
    }

    @Test
    void testsufficientSpecialChars(){
        String str = "asasa";

        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(str, 1);

        assertEquals(false, actual);
    }
}
