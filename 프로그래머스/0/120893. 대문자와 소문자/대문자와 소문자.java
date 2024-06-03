import java.util.stream.*;
class Solution {
    public String solution(String my_string) {
        return my_string.chars().mapToObj(it-> String.valueOf((char)(Character.isUpperCase(it) ? Character.toLowerCase(it) : Character.toUpperCase(it)))).collect(Collectors.joining());
    }
}