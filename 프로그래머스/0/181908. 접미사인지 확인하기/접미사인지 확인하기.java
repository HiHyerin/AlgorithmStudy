import java.util.*;
class Solution {
    public int solution(String my_string, String is_suffix) {
        ArrayList<String> answer = new ArrayList();
        int result = 0;
		for(int i = 0; i < my_string.length(); i++) {
			answer.add(my_string.substring(i));
		}
		if(answer.contains(is_suffix.toString())) {
			return 1;
		} else {
			return 0;
		}
    }
}