package junittesting.userregistrationtest;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.userregistration.UserRegistration;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    // Test valid user registration
    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> UserRegistration.registerUser("Alice", "alice@example.com", "password123"));
    }

    // Test registration with an empty username
    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("", "alice@example.com", "password123"));
        assertEquals("Username cannot be empty.", exception.getMessage());
    }

    // Test registration with an invalid email
    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("Alice", "invalid-email", "password123"));
        assertEquals("Invalid email format.", exception.getMessage());
    }

    // Test registration with a short password
    @Test
    void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("Alice", "alice@example.com", "123"));
        assertEquals("Password must be at least 6 characters long.", exception.getMessage());
    }
}

