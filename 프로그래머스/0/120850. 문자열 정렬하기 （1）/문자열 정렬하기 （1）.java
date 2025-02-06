import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        
        List<Integer> list = new ArrayList<>();
        String regExp = "^[0-9]+$";
        String[] myStringArr = my_string.split("");
        for(String s:myStringArr) {
            if(s.matches(regExp)) {
                list.add(Integer.parseInt(s));
            }
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}