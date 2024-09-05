import java.util.*;
class Solution {
    public ArrayList solution(int[] arr) {
        ArrayList stk = new ArrayList();
		int i = 0;
		while (true) {
			if(i == arr.length) {
				break;
			}
			if(stk.size() == 0) {
				stk.add(arr[i]);
				i ++;
			}
			else if (Integer.parseInt(stk.get(stk.size() - 1).toString()) < arr[i]) {
				stk.add(arr[i]);
				i++;
			}
			else 
                stk.remove(stk.size() - 1);
				
		}
        return stk;
    }
}