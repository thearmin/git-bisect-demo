package bisect;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {

    private static Stream<Arguments> createTestData() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(2, 3, 5))
                .add(Arguments.of(18, 2, 20))
                .add(Arguments.of(0, 2, 2))
                .build();
    }

    @ParameterizedTest(name = "Testing sum of {0} + {1} = {2}")
    @MethodSource("createTestData")
    void shouldSum(int s1, int s2, int result) {

        assertEquals(result, Demo.sum(s1, s2));
    }

}
