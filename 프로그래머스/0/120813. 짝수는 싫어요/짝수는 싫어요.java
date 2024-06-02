import java.util.stream.IntStream;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        return IntStream.rangeClosed(0,n)
            .filter(value->value%2 != 0)
            .toArray();
    }
}