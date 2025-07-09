import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int n = 0;
            for(String str : arr) {
                if(str.equals(arr[i])) {
                    n++;
                }
            }
            if(n == 1) {
                list.add(arr[i]);
            }
        }
        Set<String> set = new TreeSet<>(list);
        for(String str : set) {
            answer += str;
        }
        
        return answer;
    }
}