import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RangeTest {
    @DisplayName("is start with bracket should be true")
    @Test
    public void isStartWithBracket() {
        Range range = new Range("[1,5]");
        boolean actual = range.isStartWithBracket();
        assertTrue(actual);
    }
}
