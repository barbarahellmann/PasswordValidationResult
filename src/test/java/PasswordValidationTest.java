import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidationTest {


    @Test
    void isAtLeast8CharactersLong_whenEmpty_expectFalse() {
        //GIVEN
        String password = "";
        //WHEN
        boolean result = PasswordValidation.isAtLeast8CharactersLong(password);
        //THEN
        Assertions.assertFalse(result);
    }
    @Test
    void isAtLeast8CharactersLong_when8Characters_expectTrue() {
        //GIVEN
        String password = "12345678";
        //WHEN
        boolean result = PasswordValidation.isAtLeast8CharactersLong(password);
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void isAtLeast8CharactersLong_when7Characters_expectFalse() {
        //GIVEN
        String password = "1234567";
        //WHEN
        boolean result = PasswordValidation.isAtLeast8CharactersLong(password);
        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void isAtLeast8CharactersLong_when9Characters_expectTrue() {
        //GIVEN
        String password = "123456789";
        //WHEN
        boolean result = PasswordValidation.isAtLeast8CharactersLong(password);
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void containsDigit_whenEmpty_expectFalse() {
        //GIVEN
        String password = "";
        //WHEN
        boolean result = PasswordValidation.containsDigit(password);
        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void containsDigit_whenOneDigit_expectTrue() {
        //GIVEN
        String password = "5";
        //WHEN
        boolean result = PasswordValidation.containsDigit(password);
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void containsDigit_whenMixedTest_expectTrue() {
        //GIVEN
        String password = "dsfsad67dsfsadfadfs";
        //WHEN
        boolean result = PasswordValidation.containsDigit(password);
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void containsLowerAndUppercaseCharacters_whenEmpty_expectFalse() {
        //GIVEN
        String password = "";
        //WHEN
        boolean result = PasswordValidation.containsLowerAndUppercaseCharacters(password);
        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void containsLowerAndUppercaseCharacters_whenAa_expectTrue() {
        //GIVEN
        String password = "Aa";
        //WHEN
        boolean result = PasswordValidation.containsLowerAndUppercaseCharacters(password);
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void containsLowerAndUppercaseCharacters_whenA_expectFalse() {
        //GIVEN
        String password = "a";
        //WHEN
        boolean result = PasswordValidation.containsLowerAndUppercaseCharacters(password);
        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void isWellKnownPassword_whenEasyPassword_expectTrue() {
        //GIVEN
        String password = "123456";
        //WHEN
        boolean result = PasswordValidation.isWellKnownPassword(password);
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void isWellKnownPassword_whenEasyPassword2_expectTrue() {
        //GIVEN
        String password = "passwort";
        //WHEN
        boolean result = PasswordValidation.isWellKnownPassword(password);
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void isWellKnownPassword_whenHardPassword_expectFalse() {
        //GIVEN
        String password = "dskjjfhaskfaöksdlhf54";
        //WHEN
        boolean result = PasswordValidation.isWellKnownPassword(password);
        //THEN
        Assertions.assertFalse(result);
    }
}
