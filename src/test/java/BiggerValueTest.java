import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {

    BiggerValue bg;

    @BeforeEach
    void setUp (){
        bg = new BiggerValue();
    }

     @Order(1)
     @Test

      public void biggerNumberOfTwoHappyPath(){

         int a = 3333;
         int b = 9999;
         int expectedResult = 9999;

         int actualResult = bg.biggerValueOfTwo(a,b);

         Assertions.assertEquals(expectedResult, actualResult);

     }
    @Order(2)
    @Test

    public void biggerNumberOfTwoNegativeNumbers(){

        int a = -3333;
        int b = -9999;
        int expectedResult = -3333;

        int actualResult = bg.biggerValueOfTwo(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Order(3)
    @Test

    public void biggerNumberOfTwoBiggerValueEqual(){

        int a = 3333;
        int b = 3333;
        int expectedResult = 3333;

        int actualResult = bg.biggerValueOfTwo(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Order(4)
    @Test

    public void biggerNumberOfTwoOneOfThemZero(){

        int a = 0;
        int b = 3333;
        int expectedResult = 3333;

        int actualResult = bg.biggerValueOfTwo(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }






}
