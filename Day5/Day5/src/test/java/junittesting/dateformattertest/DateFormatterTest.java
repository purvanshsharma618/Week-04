package junittesting.dateformattertest;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.dateformatter.DateFormatter;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    // Test valid date formatting
    @Test
    void testValidDateFormat() {
        assertEquals("15-02-2025", DateFormatter.formatDate("2025-02-15"));
        assertEquals("01-01-2000", DateFormatter.formatDate("2000-01-01"));
    }

    // Test invalid date format (non-date input)
    @Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> DateFormatter.formatDate("invalid-date"));
        assertEquals("Invalid date format. Expected yyyy-MM-dd.", exception.getMessage());
    }

    // Test empty input
    @Test
    void testEmptyDateInput() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> DateFormatter.formatDate(""));
        assertEquals("Invalid date format. Expected yyyy-MM-dd.", exception.getMessage());
    }

    // Test null input
    @Test
    void testNullDateInput() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> DateFormatter.formatDate(null));
        assertEquals("Invalid date format. Expected yyyy-MM-dd.", exception.getMessage());
    }
}

