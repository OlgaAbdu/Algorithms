public class BiggerValue {

    public int biggerValueOfTwo(int a, int b) {
        if (a < Integer.MAX_VALUE && a > Integer.MIN_VALUE) {
            if (b < Integer.MAX_VALUE && b > Integer.MIN_VALUE) {
                if (a > b) {

                    return a;
                } else {

                    return b;
                }
            }
            return Integer.MAX_VALUE;
        }
        return Integer.MAX_VALUE;

    }
}
