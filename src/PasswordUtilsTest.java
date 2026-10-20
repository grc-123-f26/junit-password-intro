import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
    }

    @Test
    void testContainsTripleTrue() {
        assertTrue(PasswordUtils.containsTriple("paaasword"));
    }

    @Test
    void testCountSpecialCharacters() {
        assertEquals(3, PasswordUtils.countSpecialCharacters("Pa$$word!"));
    }

    @Test
    void testHasSufficientSpecialCharacters() {
        assertTrue(PasswordUtils.hasSufficientSpecialCharacters("Pa$$word!", 3));
    }
}
