import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    public void helloMooham() {
        HelloWorld helloWorld = new HelloWorld();
        String actual = helloWorld.greeting("Mooham");
        assertEquals("Hello Mooham",actual);
    }
}
