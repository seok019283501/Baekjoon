

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0,min = 0;
        int tempMax = 0,tempMin = 0;
        
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] >= sizes[i][1]) {
                tempMax = sizes[i][0];
                tempMin = sizes[i][1];
            }else{
                tempMin = sizes[i][0];
                tempMax = sizes[i][1];
            }
            if(tempMax >= max) max = tempMax;
            if(tempMin >= min) min = tempMin;
        }
        return min*max;
    }
}