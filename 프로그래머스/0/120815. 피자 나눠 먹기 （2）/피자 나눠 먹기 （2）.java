class Solution {
    public int solution(int n) {
        int i = 1;
        while(true) {
            if((6*i) % n > 0) {
                i++;
            } else {
                return i;  
            }
        }
    }
}