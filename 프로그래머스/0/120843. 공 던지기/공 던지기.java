class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int num = 0;
        int i = 0;
        while(true) {
            num ++;
            if(i >= numbers.length && numbers.length % 2 == 0) {
                i -= numbers.length;
            } else if(i >= numbers.length && numbers.length % 2 == 1) {
                i = i - numbers.length;
            }
            answer = numbers[i];
            i += 2;
            if(num == k) {
                break;
            }
        }
        
        return answer;
    }
}