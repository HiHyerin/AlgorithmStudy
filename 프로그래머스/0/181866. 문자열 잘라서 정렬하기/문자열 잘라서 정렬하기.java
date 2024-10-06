import java.util.*;
class Solution {
    public String[] solution(String myString) {
		List<String> list = Arrays.asList(myString.split("x", myString.length()));
        List<String> list2 = new ArrayList<>();
		for(String s : list) {
			if(!s.isEmpty()) {
				list2.add(s);
			}
		}
		Collections.sort(list2);
		return list2.toArray(new String[list2.size()]);
    }
}