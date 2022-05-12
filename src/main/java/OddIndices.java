public class OddIndices {

    public int[] oddIndicies(int[]array){
        int num = 0;
        if(array.length != 0){
            int[]arrayOfOddIncies = new int[array.length/2];
            for (int i = 0; i < array.length; i++) {
                if(num < arrayOfOddIncies.length){
                    if(i%2 != 0){
                        arrayOfOddIncies[num] = array[i];
                        num++;
                    }
                }
            }
            return arrayOfOddIncies;
        }
        return new int[]{};
    }
}
