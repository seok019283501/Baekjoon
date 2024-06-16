import java.util.*;
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(my_string.split("")));
        
        for(int j = 0; j < list.size(); j++){
            for(int i = 0; i < n; i++){
                answer += list.get(j);
            }
        }
        return answer;
    }
}