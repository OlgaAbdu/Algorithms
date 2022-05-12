import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddEvenAlgorithmTest {
    OddEvenAlgorithm as;

    @BeforeEach
    void setUp() {
        as = new OddEvenAlgorithm();

    }
    @Order(1)
    @Test
    public void testOddEvenAlgorithmHappyPathOddNumber() {
        long number = 1;
        String expectedResult = " Odd ";

        OddEvenAlgorithm as = new OddEvenAlgorithm();
        String actualResult = as.oddEvenAlgorithm(number);

        assertEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void testOddEvenAlgorithmHappyPathEvenNumber() {
        long number = 6;
        String expectedResult = " Even ";

        String actualResult = as.oddEvenAlgorithm(number);

        assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddEvenAlgorithmNegativeOddNumber() {
        long number = -1;
        String expectedResult = " Odd ";

        String actualResult = as.oddEvenAlgorithm(number);

        assertEquals(expectedResult,actualResult);
    }

    @Order(4)
    @Test
    public void testOddEvenAlgorithmNegativeEvenNumber() {
        long number = -4;
        String expectedResult = " Even ";

        String actualResult = as.oddEvenAlgorithm(number);

        assertEquals(expectedResult, actualResult);

    }

    @Order(5)
    @Test
    public void testOddEvenAlgorithmPositiveUndefinednumber() {
        long number = 2147483648L;
        String expectedResult = " Undefined ";

        String actualResult = as.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
