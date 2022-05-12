import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class GoodBadNumberTest {

    GoodBadNumber gBn;

    @BeforeEach
    void setUp(){
        gBn = new GoodBadNumber();
    }

    @Order(1)
    @Test

    public void testGoodBadNumberPositivePath(){

        Integer m = 15;

        String expectedResult = "Good number";

        String actualResult = gBn.goodBadNumber(m);

        assertEquals(expectedResult,actualResult);

    }
    @Order(2)
    @Test

    public void testGoodBadNumberHappyPathNegativeNumber(){

        Integer m = -15;

        String expectedResult = "Good number";

        String actualResult = gBn.goodBadNumber(m);

        assertEquals(expectedResult,actualResult);

    }
    @Order(3)
    @Test

    public void testGoodBadNumberHappyPathDevideByThree(){

        Integer m = 21;

        String expectedResult = " Bad number " ;

        String actualResult = gBn.goodBadNumber(m);

        assertEquals(expectedResult,actualResult);

    }
    @Order(4)
    @Test

    public void testGoodBadNumberHappyPathDeviceByFive(){

        Integer m = 5;

        String expectedResult = " Poor Number" ;

        String actualResult = gBn.goodBadNumber(m);

        assertEquals(expectedResult,actualResult);

    }
    @Order(5)
    @Test

    public void testGoodBadNumberNotGoodConditions(){

        Integer m = 7;

        String expectedResult = " - 1" ;

        String actualResult = gBn.goodBadNumber(m);

        assertEquals(expectedResult,actualResult);

    }
}
