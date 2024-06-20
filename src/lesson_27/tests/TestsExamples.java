package lesson_27.tests;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestsExamples {


    @BeforeEach
    public void setUp(){
        System.out.println("setUp");
    }

    @Test
    public void testAddition(){
        int res = 2 + 2;


        Integer[] arr = {1,2,3,null,4};

        Assertions.assertEquals(4, res);
        Assertions.assertNotEquals(5,res);
        assertTrue(res >= 4);
        assertFalse(res < 3);
        assertNotNull("String");
        assertNull(arr[3]);
    }

    // отключение теста

    @Test
    @Disabled
    public void emptyTest(){
        assertEquals(5,10);
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "chery", "fig"})
     void testFruits(String fruit){
        System.out.println("Fruit: " + fruit);
        assertTrue(fruit.length() > 2);
    }

    @ParameterizedTest
    //Тест для Enum
    @EnumSource(TestEnum.class)
     void testEnum(TestEnum value){
        System.out.println("Enum: " + value);
        assertNotNull(value);
    }

    //
    @ParameterizedTest
    @CsvSource({"banana, 2", "apple, 1", "cherry, 3"})
     void CsvSourceTest(String fruit, int rank){
        System.out.println("fruit: " + fruit);
        System.out.println("rank: " + rank);
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }

    //Считывание данных с файла
    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")
     void CsvFileSourceTest(String fruit, int rank, boolean bool){
        System.out.println("fruit: " + fruit + " | rank: " + rank + " | bool: " + bool);

        assertTrue(fruit.length() > 3 && rank > 0);
    }

    @ParameterizedTest
    @MethodSource("testMethodSource")
    void testDataFromMethod(String fruit){
        System.out.println(fruit);
        assertTrue(fruit.length() > 4);
    }

    static Stream<String> testMethodSource(){
        return Stream.of("banana", "cherry", "orange");
    }


    @ParameterizedTest
    @MethodSource("squareTestData")
    void testSquare (int input, int expected, boolean isEqual){
        System.out.println(input + " | " + expected + " | " + isEqual);
        int res = input * input;
        assertEquals(isEqual, res == expected);
    }

    static Stream<Arguments> squareTestData (){
        return Stream.of(
          Arguments.of(2,  4, true),
          Arguments.of(3,9,true),
          Arguments.of(4, 10, false)

        );
    }

    @Nested
    class NestedTes{

        @BeforeEach
        public void setStartValue(){
            System.out.println("Nested Before Each");
        }
        @Test
        void testNested() {
            assertNotEquals(5, 10);
        }

        @Test
        void testNested2 (){
            assertNotNull("java");
        }
    }

}