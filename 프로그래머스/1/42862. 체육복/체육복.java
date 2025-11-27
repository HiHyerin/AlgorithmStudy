import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> reserveSet = new TreeSet<>();
        Set<Integer> lostSet = new TreeSet<>();
        Set<Integer> interSet =  new HashSet<>();
        int answer = n;

        for(int r : reserve) {
            reserveSet.add(r);
            interSet.add(r);
        }
        for(int l : lost) {
            lostSet.add(l);
        }
        interSet.retainAll(lostSet);
        reserveSet.removeAll(interSet);
        lostSet.removeAll(interSet);

        for(int i : lostSet) {
            if(reserveSet.contains(i-1)) {
                reserveSet.remove(i-1);
            } else if (reserveSet.contains(i+1)) {
                reserveSet.remove(i+1);
            } else {
                answer --;
            }
        }
        return answer;
    }
}