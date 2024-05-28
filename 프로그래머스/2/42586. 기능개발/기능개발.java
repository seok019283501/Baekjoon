import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        int pI = 0;
        int sI = 0;
        int size = progresses.length;
        int index = 0;
        int pre = 0;
        int day = 0;
        for(int i = 0; i < size; i++){
            pI = progresses[i];
            sI = speeds[i];
            day = (100-pI)/sI;
            if((100-pI)-sI*day != 0){
                day += 1;
            }
            if(i == 0){
                answer.add(1);
                pre = day;
                continue;
            }else if(pre >= day){
                int item = answer.get(index);
                answer.add(item+1);
                answer.remove(index);
            }else{
                answer.add(1);
                pre = day;
                index++;
            }
            
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}