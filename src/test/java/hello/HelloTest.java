package hello;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloTest {

    @Test
    public void testSayHello() {
        Assertions.assertEquals("Hello World!", new Hello().sayHello());
    }
}
