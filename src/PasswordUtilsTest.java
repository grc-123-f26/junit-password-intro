import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PasswordUtilsTest {

    @Test
    void testDescribePasswordLengthShortPassword() {
        // Arrange
        String password = "hello";

        // Act
        String actual = PasswordUtils.describePasswordLength(password);

        // Assert
        assertEquals("short", actual);
    }
    @Test
void testAlphanumericPassword() {
    String password = "Hello123";
    boolean actual = PasswordUtils.isAlphanumeric(password);
    assertTrue(actual);
}

@Test
void testPasswordWithSpecialCharacter() {
    String password = "Hello123!";
    boolean actual = PasswordUtils.isAlphanumeric(password);
    assertFalse(actual);
}

@Test
void testPasswordOnlySpecialCharacter() {
    String password = "!";
    boolean actual = PasswordUtils.isAlphanumeric(password);
    assertFalse(actual);
}
@Test
void testPasswordWithTriple() {
    String password = "paaassword";
    boolean actual = PasswordUtils.containsTriple(password);
    assertTrue(actual);
}

@Test
void testPasswordWithoutTriple() {
    String password = "password";
    boolean actual = PasswordUtils.containsTriple(password);
    assertFalse(actual);
}

@Test
void testPasswordWithSpecialCharacters() {
    String password = "Hello!@123";
    int actual = PasswordUtils.countSpecialCharacters(password);
    assertEquals(2, actual);
}

@Test
void testPasswordWithoutSpecialCharacters() {
    String password = "Hello123";
    int actual = PasswordUtils.countSpecialCharacters(password);
    assertEquals(0, actual);
}

@Test
void testPasswordWithSpace() {
    String password = "Hello World";
    int actual = PasswordUtils.countSpecialCharacters(password);
    assertEquals(1, actual);
}

@Test
void testEnoughSpecialCharacters() {
    String password = "Hello!@";
    boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, 2);
    assertTrue(actual);
}

@Test
void testNotEnoughSpecialCharacters() {
    String password = "Hello!";
    boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, 2);
    assertFalse(actual);
}

@Test
void testMinimumZero() {
    String password = "Hello123";
    boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, 0);
    assertTrue(actual);
}

@Test
void testPasswordLengthExactly12() {
    String password = "abcdefghijkl";
    String actual = PasswordUtils.describePasswordLength(password);
    assertEquals("long", actual);
}

}