import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AscendingSequenceTest {


   @Order(1)
    @Test

    public void testascendingSequenceHappyPathPositiveNumbers(){
        //for first happy path posledovatelnost; 0,1,2,3,4,5
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0,1,2,3,4,5};


        AscendingSequence as = new  AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start,end,step);
        Assertions.assertArrayEquals(expectedResult,actualResult );
    }
    @Order(2)
    @Test
    public void testascendingSequenceHappyPathForNegativeNumbers(){
        //for first happy path posledovatelnost; -10,-9,-8,-7
        int start =-10;
        int end = -7 ;
        int step = 1;
        int[] expectedResult = {-10,-9,-8,3,-7};


        AscendingSequence as = new  AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start,end,step);
        Assertions.assertArrayEquals(expectedResult,actualResult );
    }
    @Order(3)
    @Test
    public void testascendingSequenceHappyPathForNegativeAndPositiveNumbers(){
        //for first happy path posledovatelnost; -10,-9,-8,-7
        int start =-5;
        int end = 5 ;
        int step = 1;
        int[] expectedResult = {-5,-4,-3,-2,-1,0,1,2,3,4,5};


        AscendingSequence as = new  AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start,end,step);
        Assertions.assertArrayEquals(expectedResult,actualResult );
    }
    @Order(4)
    @Test

    public void testascendingSequenceStepTwo(){
        //negative test
        int start = 0;
        int end = 5;
        int step = 2;
        int[] expectedResult = {0,2,4};


        AscendingSequence as = new  AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start,end,step);
        Assertions.assertArrayEquals(expectedResult,actualResult );
    }
    @Test

    public void testascendingSequenceStartLargerThanEnd(){
       //negative scenario
        int start = 5;
        int end = 0;
        int step = 2;
        int[] expectedResult = {};


        AscendingSequence as = new  AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start,end,step);
        Assertions.assertArrayEquals(expectedResult,actualResult );
    }
    @Test

    public void testascendingSequenceNegativeStep(){
        //negative scenario//polucheniye pustogo massiva
        int start = 0;
        int end = 5;
        int step = -1;
        int[] expectedResult = {};


        AscendingSequence as = new  AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start,end,step);
        Assertions.assertArrayEquals(expectedResult,actualResult );
    }
    @Test

    public void testascendingSequenceStepIsZero(){
        //negative scenario//polucheniye pustogo massiva
        int start = 0;
        int end = 5;
        int step = 0;
        int[] expectedResult = {};


        AscendingSequence as = new  AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start,end,step);
        Assertions.assertArrayEquals(expectedResult,actualResult );
    }
}
