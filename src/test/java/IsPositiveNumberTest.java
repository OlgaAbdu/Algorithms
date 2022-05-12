import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsPositiveNumberTest {

    IsPositiveNumber iSp;

    @BeforeEach
    void setUp(){

       iSp = new IsPositiveNumber();
    }

    @Order(1)
    @Test

    public void testIsPositiveNumberHappyPath(){

        int a = 8;
        boolean expectedResult = true;

        boolean actualResult = iSp.isItPositiveNumber(a);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Order(2)
    @Test

    public void testIsPositiveNumberHappyPathNumberIsZero(){

        int a = 0;
        boolean expectedResult = true;

        boolean actualResult = iSp.isItPositiveNumber(a);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Order(3)
    @Test

    public void testIsPositiveNumberHappyPathNumberIsNegative(){

        int a = -90;
        boolean expectedResult = false;

        boolean actualResult = iSp.isItPositiveNumber(a);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Order(4)
    @Test

    public void testIsPositiveNumberMaxValue(){

        int a = Integer.MAX_VALUE;
        boolean expectedResult = true;

        boolean actualResult = iSp.isItPositiveNumber(a);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Order(5)
    @Test

    public void testIsPositiveNumberMinValue(){

        int a = Integer.MIN_VALUE;
        boolean expectedResult = false;

        boolean actualResult = iSp.isItPositiveNumber(a);

        Assertions.assertEquals(expectedResult,actualResult);

    }


}
