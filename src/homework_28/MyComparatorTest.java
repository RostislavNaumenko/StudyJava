package homework_28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MyComparatorTest {

    Integer[] array;

    @BeforeEach
    void setUp() {
        array = new Integer[] {1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
    }

    @Test
    void testMyComparator() {
        Arrays.sort(array, new MyComparator());
        System.out.println(Arrays.toString(array));
        Assertions.assertArrayEquals(new Integer[]{2, 4, 6, 8, 1, 3, 5, 7, 7, 9}, array);
    }
}
