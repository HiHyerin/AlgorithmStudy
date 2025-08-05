import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        Arrays.sort(dots, Comparator.comparingInt(a -> a[0]));
        int x = Math.abs(dots[0][1]-dots[1][1]);
        int y = Math.abs(dots[1][0]-dots[2][0]);
        return x*y;
    }
}