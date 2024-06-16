import java.util.*;
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(my_string.split("")));
        
        for(String item : list){
            for(int i = 0; i < n; i++){
                answer += item;
            }
        }
        return answer;
    }
}