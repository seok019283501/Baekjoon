import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> data = new ArrayList();
        int temp = arr[0];
        data.add(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(temp != arr[i]){
                data.add(arr[i]);
                temp = arr[i];
            }
        }
        
        
        
        

        return data.stream().mapToInt(Integer::intValue).toArray();
    }
}