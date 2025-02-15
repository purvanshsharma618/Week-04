package junittesting.passwordstrengthvalidatortest;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.passwordstrengthvalidator.PasswordValidator;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    // Test a valid password
    @Test
    void testValidPassword() {
        assertDoesNotThrow(() -> PasswordValidator.isValidPassword("ValidPass1"));
    }

    // Test password too short
    @Test
    void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> PasswordValidator.isValidPassword("Short1"));
        assertEquals("Password must be at least 8 characters long.", exception.getMessage());
    }

    // Test password missing uppercase letter
    @Test
    void testMissingUppercase() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> PasswordValidator.isValidPassword("weakpass1"));
        assertEquals("Password must contain at least one uppercase letter.", exception.getMessage());
    }

    // Test password missing digit
    @Test
    void testMissingDigit() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> PasswordValidator.isValidPassword("WeakPass"));
        assertEquals("Password must contain at least one digit.", exception.getMessage());
    }

    // Test null password input
    @Test
    void testNullPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> PasswordValidator.isValidPassword(null));
        assertEquals("Password must be at least 8 characters long.", exception.getMessage());
    }
}
