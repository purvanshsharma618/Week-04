package junittesting.filehandlingtest;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.filehandling.FileProcessor;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessorTest {

    private static final String TEST_FILE = "testfile.txt";
    private static final String TEST_CONTENT = "Hello, this is a test file.";

    // Test writing and reading a file
    @Test
    void testWriteAndReadFile() throws IOException {
        FileProcessor.writeToFile(TEST_FILE, TEST_CONTENT);
        String readContent = FileProcessor.readFromFile(TEST_FILE);
        assertEquals(TEST_CONTENT, readContent, "File content should match the written content.");
    }

    // Test if the file exists after writing
    @Test
    void testFileExistsAfterWrite() throws IOException {
        FileProcessor.writeToFile(TEST_FILE, TEST_CONTENT);
        assertTrue(Files.exists(Path.of(TEST_FILE)), "File should exist after writing.");
    }

    // Test handling of IOException when file does not exist
    @Test
    void testReadNonExistentFile() {
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"), "Reading a non-existent file should throw IOException.");
    }
}

