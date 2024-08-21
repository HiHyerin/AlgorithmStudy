class Solution {
    public int solution(int a, int b) {
        String ab = Integer.toString(a) + b;
        
        int abToInt = Integer.parseInt(ab);
        int doubleAb = 2 * a * b;
        
        int answer = abToInt >= doubleAb ? abToInt : doubleAb;
        return answer;
    }
}