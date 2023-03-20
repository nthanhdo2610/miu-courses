package lesson12;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class StreamOperationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test(){
        List<String> in = Arrays.asList("one", "two");
        List<String> expected = Arrays.asList("ONE", "TWO");
        Assertions.assertEquals(expected, StreamOperation.fn.apply(in));
    }
}