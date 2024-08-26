class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;
        int pow = 1;
        if(a!=b && a!=c && b!=c) {
            pow = 1;
        } else if(a==b && a==c && b==c) {
            pow = 3;
        } else {
            pow = 2;
        }
        
        for(int i=0; i<pow; i++) {
            answer *= (Math.pow(a, i+1) + Math.pow(b, i+1) + Math.pow(c, i+1));
        }
        return answer;
    }
}