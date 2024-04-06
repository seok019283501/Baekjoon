import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int it : nums){
            if(map.get(it) == null){
                map.put(it,it);
            }
        }
        
        if(map.size() < answer){
            answer = map.size();
        }
        return answer;
    }
}