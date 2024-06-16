import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int[] answerList = {0,0,0};
        int firstIdx = 0;
        int secondIdx = 0;
        int thirdIdx = 0;
        int ans = 0;
        int size = answers.length;
        for(int i = 0; i < size; i++){
            ans = answers[i];
            if(firstIdx == 5){firstIdx = 0;}
            if(secondIdx == 8){secondIdx = 0;}
            if(thirdIdx == 10){thirdIdx = 0;}
            if(first[firstIdx] == ans){answerList[0]++;}
            if(second[secondIdx] == ans){answerList[1]++;}
            if(third[thirdIdx] == ans){answerList[2]++;}
            firstIdx++;
            secondIdx++;
            thirdIdx++;
        }
        int max = 0;
        for(int i = 0; i < 3; i++){
            if(max < answerList[i]){
                max = answerList[i];
                
            }
        }
        for(int i = 0; i < 3; i++){
            if(max == answerList[i]){
                answer.add(i+1);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}