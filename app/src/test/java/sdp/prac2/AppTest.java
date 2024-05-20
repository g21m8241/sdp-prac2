package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    // Test Case 1: Empty List Test Case
    @Test
    void testEmptyList() {
        // Given
        List<String> inputList = new ArrayList<>();
        // When
        List<String> result = Task2(inputList);
        // Then
        List<String> expectedOutput = new ArrayList<>();
        assertEquals(expectedOutput, result);
    }

    // Test Case 2: Normal Input Test Case
    @Test
    void testNormalInput() {
        // Given
        List<String> inputList = Arrays.asList("apple", "banana", "carrot");
        // When
        List<String> result = Task2(inputList);
        // Then
        List<String> expectedOutput = Arrays.asList("pple", "anana", "arrot");
        assertEquals(expectedOutput, result);
    }

    // Test Case 3: List with Empty Strings Test Case
    @Test
    void testListWithEmptyStrings() {
        // Given
        List<String> inputList = Arrays.asList("apple", "", "banana", "", "carrot");
        // When
        List<String> result = Task2(inputList);
        // Then
        List<String> expectedOutput = Arrays.asList("pple", "anana", "arrot");
        assertEquals(expectedOutput, result);
    }

    // Add other test cases here following the same pattern
    // ...
}

