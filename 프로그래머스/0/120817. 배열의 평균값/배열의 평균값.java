class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int size = numbers.length;
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        answer = (double)sum/size;
        return answer;
    }
}