class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int x = 3;
        int sum = brown + yellow;
        while(true) {
            if(sum % x == 0) {
                int y = sum/x;
                if(x>=y && yellow == (x-2)*(y-2)) {
                    answer[0] = x;
                    answer[1] = y;
                    break; 
                }
            }
            x++;
        }
        
        return answer;
    }
}