public class AscendingSequence {
    
    //stroim massiv s cherednostyu cifr ; 0,1,2,3,4,5 v pustoi  massiv i vichislayem skolko budet elementov i ix znachenie
    

    public int[]ascendingSequenceAlgorithm(int start,int end, int step){
        if( step > 0 && start < end ){
            int[]result = new int [(end - start + 1)/step];

            for (int i = 0; i < result.length ; i++) {
                if(start <= end){
                    result[i ] = start;
                    start += step;
                }
            }
            return result;
        }
       return new int[]{};
    }
}
