import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class isAlphaNumericTest {
    @Test
void testIsAlphanumericValidPassword() {
    // arrange
    String password = "abc123";
    // act
    boolean actual = PasswordUtils.isAlphanumeric(password);
    // assert
    assertEquals(true, actual);
}

@Test
void testIsAlphanumericSymbolAtEnd() {
    // arrange
    String password = "abc123!";
    // act
    boolean actual = PasswordUtils.isAlphanumeric(password);
    // assert
    assertEquals(false, actual);

    
}

@Test
void testContainsTripleInMiddle() {
    // arrange
    String password = "paaasword";
    // act
    boolean actual = PasswordUtils.containsTriple(password);
    // assert
    assertEquals(true, actual);
}

}
