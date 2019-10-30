import com.agnieszkazdunek.Password;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PasswordTest {
    Password testPassword;

    @BeforeEach
    void beforeEach() {
        String password = "duck";
        char[] passwordArray = password.toCharArray();
        testPassword = new Password(passwordArray);
    }

    @Test
    void shouldEncryptPassword() {
        char[] expectedPassword = {'_','_','_','_'};

        Assertions.assertArrayEquals(expectedPassword, testPassword.getEncryptedValue());
    }

    @Test
    void shouldRevealLetter(){
        char letter = 'd';

        char[] expectedPassword = {'d','_','_','_'};

        testPassword.revealLetter(letter);

        Assertions.assertArrayEquals(expectedPassword, testPassword.getEncryptedValue());
    }

    @Test
    void shouldNotRevealLetter(){
        char letter = 'e';

        char[] expectedPassword = {'_','_','_','_'};

        testPassword.revealLetter(letter);

        Assertions.assertArrayEquals(expectedPassword, testPassword.getEncryptedValue());
    }

    @Test
    void isPasswordContainingLetter(){
        char letter ='d';
        Assertions.assertTrue(testPassword.contains(letter));
    }

    @Test
    void isNotPasswordContainingLetter(){
        char letter ='e';

        Assertions.assertFalse(testPassword.contains(letter));
    }
}
