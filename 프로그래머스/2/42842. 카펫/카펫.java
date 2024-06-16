class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        int idx = 1;
        int item = 0;
        int row = 0;
        row = yellow+2;
        while(brown != item){
            item = row*2+idx*2;
            answer[0] = row;
            answer[1] = idx+2;
            idx++;
            if(yellow%idx == 0){
                row = yellow/idx+2;
            }
        }
        return answer;
    }
}