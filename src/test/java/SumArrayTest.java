import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumArrayTest {
     SumArray as;

    @BeforeEach
    void setUp(){
        as = new SumArray();
    }

    @Order(1)
    @Test

    public void testSumArrayHappyPathAllCorect(){

        int [] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualResult = as.sumArray(array);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Order(2)
    @Test

    public void testSumArrayHappyPathWithNegativeNUmbers(){

        int [] array = {-7, -3};
        int expectedResult = -10 ;

        int actualResult = as.sumArray(array);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Order(3)
    @Test

    public void testSumArrayHappyPathZeroValue(){

        int [] array = {0};
        int expectedResult = 0;

        int actualResult = as.sumArray(array);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Order(4)
    @Test

    public void testSumArrayOfNegativeAndPositiveNumbers(){

        int [] array = {0,-25,300};
        int expectedResult = 275;

        int actualResult = as.sumArray(array);

        Assertions.assertEquals(expectedResult,actualResult);

    }



}
