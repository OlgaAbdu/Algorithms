import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AreNumbersEqualTest {

    AreNumbersEqual aR;

    @BeforeEach

    void setUp(){

        aR = new AreNumbersEqual();
    }

    @Order(1)
    @Test

    public void testAreNumbersEqualHappyPathEquals(){

        int a = 89;
        int b = 89;

        int expectedResult = 0;

        int actualResult = aR.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Order(2)
    @Test

    public void testAreNumbersEqualOneIsSmaller(){

        int a = -89;
        int b = 89;

        int expectedResult = -1;

        int actualResult = aR.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Order(3)
    @Test

    public void testAreNumbersEqualOneIsBigger(){

        int a =  89;
        int b = -89;

        int expectedResult = 1;

        int actualResult = aR.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);

    }
}
