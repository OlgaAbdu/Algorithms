public class OddEvenAlgorithm {


    public String oddEvenAlgorithm(long number) {
        String odd = " Odd ";
        String even = " Even ";
        String und = " Undefined ";

        if (number <= 2147483647L && number >= -2147483648L) {
            if (number % 2 == 0) {

                return even;
            } else {

                return odd;
            }
        }
            return und;
        }


    }






