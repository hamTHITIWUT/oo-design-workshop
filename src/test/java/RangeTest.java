import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RangeTest {
    @DisplayName("is start with inclusive")
    @Test
    public void isStartWithInclusive() {
        Range range = new Range("[1,5]");
        boolean actual = range.isStartWithInclusive();
        assertTrue(actual);
    }

    @DisplayName("is not start with bracket should be false.")
    @Test
    public void isNotStartWithBracket() {
        Range range = new Range("(1,5]");
        boolean actual = range.isStartWithInclusive();
        assertFalse(actual);
    }

    @DisplayName("get start input [1,5] should be 1")
    @Test
    public void getStartInputShouldBe1() {
        Range range = new Range("[1,5]");
        int actual = range.getStartInput();
        assertEquals(1, actual);

    }

    @DisplayName("get start input [1,5] should be 5")
    @Test
    public void getEndInputShouldBe5() {
        Range range = new Range("[1,5]");
        int actual = range.getEndInput();
        assertEquals(5, actual);

    }

    @DisplayName("is end inclusive")
    @Test
    public void isEndWithInclusive() {
        Range range = new Range("[1,5]");
        boolean actual = range.isEndWithInclusive();
        assertTrue(actual);
    }

    @DisplayName("is not end inclusive")
    @Test
    public void isNotEndWithInclusive() {
        Range range = new Range("[1,5)");
        boolean actual = range.isEndWithInclusive();
        assertFalse(actual);
    }
}
