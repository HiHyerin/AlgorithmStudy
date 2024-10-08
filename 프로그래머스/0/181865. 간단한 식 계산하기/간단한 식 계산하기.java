import java.util.*;
class Solution {
    public int solution(String binomial) {
        List<String> list = Arrays.asList(binomial.split(" "));
        switch(list.get(1)) {
            case "+":
                return Integer.parseInt(list.get(0)) + Integer.parseInt(list.get(2));
            case "-":
                return Integer.parseInt(list.get(0)) - Integer.parseInt(list.get(2));
            case "*":
                return Integer.parseInt(list.get(0)) * Integer.parseInt(list.get(2));
        }
        return 0;
        
    }
}