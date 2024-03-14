package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordGeneratorTest {
    @Test
    void whenGenerating_expect8Chars() {
        //GIVEN
        //WHEN
        String password = PasswordGenerator.generate();
        //THEN
        System.out.println(password);
        Assertions.assertEquals(8, password.length());
    }

    @Test
    void whenGenerating_expectSafePassword() {
        //GIVEN
        //WHEN
        String password = PasswordGenerator.generate();
        //THEN
        System.out.println(password);
        Assertions.assertTrue(PasswordValidation.isSafe(password));
    }
}
