import java.util.*;
class Solution {
    public Object[] solution(int[] arr, int k) {
        int j = 0;
		List list = new ArrayList();
		for(int i=0; i<arr.length; i++) {
			if(j<k) {
				if(i == 0) {
					list.add(arr[i]);
					j++;
				} else if(!list.contains(arr[i])) {
					list.add(arr[i]);
					j++;
				}
			}
		}

		while(j<k) {
			if(list.size() < k) {
				list.add(-1);
				j++;
			}
		}
        return list.toArray(new Integer[list.size()]);
    }
}