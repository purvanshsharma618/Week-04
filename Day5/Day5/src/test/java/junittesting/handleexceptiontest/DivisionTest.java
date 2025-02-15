package junittesting.handleexceptiontest;


import static org.junit.jupiter.api.Assertions.*;
import com.junit.handleexception.Division;
import org.junit.jupiter.api.Test;

public class DivisionTest {

    @Test
    void testDivision(){
        assertEquals(2, Division.divide(6,3));
        assertEquals(9, Division.divide(81,9));
    }

    @Test
    void testDivideByZeroException() {
        Exception exception = assertThrows(ArithmeticException.class , () -> Division.divide(10, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

}
