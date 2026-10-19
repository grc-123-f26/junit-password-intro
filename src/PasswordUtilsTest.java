import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        // Arrange (setup for the test)
        String password = "hello"; // create password
        // Act (act the method under test)
        String actual = PasswordUtils.describePasswordLength(password); // call method and store in "actual"
        // Assert (expected result)
        assertEquals("short", actual); // (expected result, actual result)
    }

    @Test 
    void testDescribePasswordLengthExactly12Characters() {
        // Arrange
        String password = "************";
        // Act
        String actual = PasswordUtils.describePasswordLength(password);
        // Assert
        assertEquals("long", actual);
    }

    @Test 
    void testDescribePasswordLengthExtraLongPassword() {
        // Arrange
        String password = "rhgiejrgjehignodfjgidnjgwewgfgshdfjhdoufghdfgidfg";
        // Act
        String actual = PasswordUtils.describePasswordLength(password);
        // Assert
        assertEquals("extra long", actual);
    }

    @Test 
    void testDescribeContainsTriple() {
        // Arange
        String password = "paaasword";
        // Act
        boolean actual = PasswordUtils.containsTriple(password);
        // Assert
        assertEquals(true, actual);
    }
}
