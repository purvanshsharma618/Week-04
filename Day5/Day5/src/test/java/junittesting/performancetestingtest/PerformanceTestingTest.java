package junittesting.performancetestingtest;

import static org.junit.jupiter.api.Assertions.fail;

import com.junit.performancetesting.PerformanceTesting;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

public class PerformanceTestingTest {

    // Test that fails if the method takes more than 2 seconds
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Fails if execution time exceeds 2 seconds
    void testLongRunningTask() {
        PerformanceTesting.longRunningTask(); // This should fail because it takes 3 seconds
        fail("Test should have failed due to timeout");
    }
}

