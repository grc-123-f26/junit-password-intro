import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        //arrange
        String password = "hello";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("short",actual);
        
    }

    @Test
    void testDescribePasswordLengthExactly12Chars(){
        //arrange
        String password = "************";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("long",actual);
    }

    @Test
    void testDescribePasswordLengthExtraLongPassword(){
        //arrange
        String password = "jhhhhhagagsvfdhgacgsdhajfjakjgnasf";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("extra long", actual);
    }
    @Test void testContainsTripleTrue(){
        String password = "paaasword";
        boolean actual = PasswordUtils.containsTriple(password);
        assertEquals(true,actual);
    }

    @Test void testContainsTripleFalse(){
        String password = "pasword";
        boolean actual = PasswordUtils.containsTriple(password);
        assertEquals(false,actual);
    }

    @Test void testCountSpecialCharactersThree(){
        String password = "p@ssword!?";
        int actual = PasswordUtils.countSpecialCharacters(password);
        assertEquals(3,actual);
    }

    @Test void testCountSpecialCharactersZero(){
        String password = "password1";
        int actual = PasswordUtils.countSpecialCharacters(password);
        assertEquals(0,actual);
    }

    @Test void testHasSufficientSpecialCharactersTrue(){
        String password = "p@ssword!?";
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, 2);
        assertEquals(true, actual);
    }

    @Test void testHasSufficientSpecialCharactersExact(){
        String password = "p@ssword!?";
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, 3);
        assertEquals(true, actual);
    }

    @Test void testHasSufficientSpecialCharactersFalse(){
        String password = "password";
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, 2);
        assertEquals(false, actual);
    }
}
