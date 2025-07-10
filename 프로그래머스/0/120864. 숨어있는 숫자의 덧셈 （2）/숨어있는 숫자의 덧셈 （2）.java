import java.util.regex.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        Pattern p = Pattern.compile("([0-9])+");
        Matcher m = p.matcher(my_string);
        while (m.find()) {
            answer += Integer.parseInt(m.group());
        }
        
        return answer;
    }
}