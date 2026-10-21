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
        // act
        String actual = PasswordUtils.describePasswordLength(password);
        // assert
        assertEquals("long", actual);
    }
    @Test 
    void testDescribePasswordLengthExtraLongPassword() {
        // arrange
        String password = "sdjhfjakshdfkjashfkjshfkjsakfhaskjhfkasjhfkjashfkjshfkjahskfjhsakfjaskjfhsa";
        // act
        String actual = PasswordUtils.describePasswordLength(password);
        // assert
        assertEquals("extra long", actual);
    }
}
