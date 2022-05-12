import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddIndicesTest {
    OddIndices as;

    @BeforeEach
    void setUp() {
        as = new OddIndices();

    }
    @Test
    @Order(1)
    public void testOddIndicesHappyPath(){
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        int[] actualResult = as.oddIndicies(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    @Order(2)
    public void testOddIndicesHappyPathNegativeNumbersNotCorrectResult(){
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {-45, 985};

        int[] actualResult = as.oddIndicies(array);

        Assertions.assertNotEquals(expectedResult,actualResult);

    }
    @Test
    @Order(3)
    public void testOddIndicesEmptyArray(){
        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = as.oddIndicies(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    @Order(4)
    public void testOddIndicesNegativeNumbers(){
        int[] array = {-45, -590, -234, -985, -12, -68};
        int[] expectedResult = {-590, -985, -68};

        int[] actualResult = as.oddIndicies(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    @Order(5)
    public void testOddIndicesAllPositiveNumbers(){
        int[] array = {45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        int[] actualResult = as.oddIndicies(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
}
