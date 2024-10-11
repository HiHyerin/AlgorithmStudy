import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        List<String> myList = new ArrayList<>();
		String[] answer = myStr.replaceAll("[abc]", " ").split(" ");
		myStr.replaceAll("[abc]", "0");
		for(String s : answer) {
			if(!s.isEmpty()) {
				myList.add(s);
			}
		}
        if(myList.isEmpty()) {
			return new String[]{"EMPTY"};
		}
        return myList.toArray(new String[myList.size()]);
    }
}