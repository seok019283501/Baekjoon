import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(String rsp) {
        return Arrays.stream(rsp.split("")).map(it->it.equals("2") ? "0": it.equals("5") ? "2" : "5").collect(Collectors.joining());
    }
}