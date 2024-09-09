import java.util.*;
class Solution {
    public ArrayList solution(int n, int k) {
        ArrayList list = new ArrayList();
        int answer = k;
        
        while(k <= n) {
            list.add(k);
            k += answer;
        }
        return list;
    }
}