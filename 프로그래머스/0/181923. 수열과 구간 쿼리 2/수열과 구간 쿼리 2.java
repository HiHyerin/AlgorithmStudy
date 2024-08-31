import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
		ArrayList list = new ArrayList();
		for(int i=0; i<queries.length; i++) {
			for(int j= queries[i][0]; j<= queries[i][1]; j++){
				if(arr[j]> queries[i][2]) {
					list.add(arr[j]);
				}
			}

			if(list.size() == 0) {
				answer[i] = -1;
			} else {
				answer[i] = (int) Collections.min(list);
			}
			list.clear();
		}
        return answer;
    }
}