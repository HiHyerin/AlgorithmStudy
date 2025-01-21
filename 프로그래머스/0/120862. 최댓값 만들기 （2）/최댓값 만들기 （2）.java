class Solution {
    public int solution(int[] numbers) {
        int answer = -999999999;
        for(int i=0; i<numbers.length; i++) {
            for (int n=0; n<numbers.length; n++) {
                if(i != n) {
                    int answer2 = numbers[i] * numbers[n];
                    if(answer < answer2) {
                        answer = answer2;
                    }
                }
            }
        }
        
        return answer;
    }
}