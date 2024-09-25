class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i=0; i<num_list.length; i++) {
            int value = num_list[i];
            while(value != 1) {
                if(value % 2 == 0) {
                    value /= 2;
                    answer ++;
                } else {
                    value = (value - 1) / 2;
                    answer ++;
            }
            }
            
        }
        return answer;
    }
}