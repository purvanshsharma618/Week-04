package junittesting.evennumbertest;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.evennumber.EvenNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenNumberTest {

    @Test
    void testIsEven(){
        assertEquals(true, EvenNumber.isEven(22));
        assertEquals(false, EvenNumber.isEven(21));
    }
}
