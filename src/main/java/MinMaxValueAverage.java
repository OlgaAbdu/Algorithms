public class MinMaxValueAverage {


    public static int[] minMaxValueAverage(int[]array ,int start ,int end ){

        if(array.length == 0 || start < 0 || end >(array.length) -1 || start > end){

            return new int[]{};
        }

        int [] newArray = { Integer.MAX_VALUE, Integer.MIN_VALUE,0};

        for (int i = start; i <= end  ; i++) {
            if (array[i] < newArray[0]) {
                newArray[0] = newArray[i];
            }
            if(array[i] > array[1]){
                newArray[1] = array[i];
            }
            newArray[2] = newArray[2] + array[i];

        }

        newArray[2] = newArray[2]/(end - start +1);

        return newArray;
    }
}
